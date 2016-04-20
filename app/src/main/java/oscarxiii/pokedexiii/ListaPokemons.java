package oscarxiii.pokedexiii;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import oscarxiii.pokedexiii.provider.pokexiii.PokexiiiColumns;


public class ListaPokemons extends Fragment implements android.support.v4.app.LoaderManager.LoaderCallbacks<Cursor> {
    private ArrayList items;
    private AdapterListPokemon adapter;

    public ListaPokemons() {
        // Required empty public constructor
    }

    private void llamadaPokeApi(){
        ClientPokeApi apiClient = new ClientPokeApi(getContext());
        apiClient.getPokemon();
    }

    @Override
    public void onStart(){
        super.onStart();
        llamadaPokeApi();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_lista_pokemons, container, false);
        final ListView pokeList = (ListView)rootView.findViewById(R.id.listPokemon);
        items = new ArrayList<>();
        adapter = new AdapterListPokemon(
                getContext(),
                R.layout.lista_pokemon_adapter,
                null,
                new String[]{
                        PokexiiiColumns.NAME,
                        PokexiiiColumns.PKDX_ID
                },
                new int[]{},
                0);


        getLoaderManager().initLoader(0, null, this);
        pokeList.setAdapter(adapter);

        pokeList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(getContext(), PokemonDetails.class);
                i.putExtra("pokemon", id);
                startActivity(i);
            }
        });
        return rootView;
    }


    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return new CursorLoader(getContext(),PokexiiiColumns.CONTENT_URI, null, null, null, null);
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        adapter.swapCursor(data);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        adapter.swapCursor(null);
    }
}
