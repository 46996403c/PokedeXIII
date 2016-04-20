package oscarxiii.pokedexiii;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import oscarxiii.pokedexiii.provider.typoxiii.TypoxiiiColumns;

/**
 * Created by Usuario on 20/04/2016.
 */
public class ListaTypes extends Fragment implements android.support.v4.app.LoaderManager.LoaderCallbacks<Cursor> {
    private ArrayList items;
    private AdapterTypePokemon adapter;

    public ListaTypes() {
        // Required empty public constructor
    }

    private void llamadaPokeApi(){
        ClientPokeApi apiClient = new ClientPokeApi(getContext());
        apiClient.getType();
    }

    @Override
    public void onStart(){
        super.onStart();
        llamadaPokeApi();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_types_pokemons, container, false);
        final ListView typeList = (ListView)rootView.findViewById(R.id.listTypes);
        items = new ArrayList<>();
        adapter = new AdapterTypePokemon(
                getContext(),
                R.layout.type_pokemon_adapter,
                null,
                new String[]{
                        TypoxiiiColumns._ID
                },
                new int[]{},
                0);

        getLoaderManager().initLoader(0, null, this);
        typeList.setAdapter(adapter);

        return rootView;
    }


    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return new CursorLoader(getContext(),TypoxiiiColumns.CONTENT_URI, null, null, null, null);
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

