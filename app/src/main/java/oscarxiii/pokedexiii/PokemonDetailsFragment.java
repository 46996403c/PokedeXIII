package oscarxiii.pokedexiii;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import oscarxiii.pokedexiii.provider.pokexiii.PokexiiiColumns;
import oscarxiii.pokedexiii.provider.pokexiii.PokexiiiCursor;


/**
 * A placeholder fragment containing a simple view.
 */
public class PokemonDetailsFragment extends Fragment {
    long id;


    public PokemonDetailsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_pokemon_details, container, false);

        Intent i = getActivity().getIntent();
        id = (long) i.getSerializableExtra("pokemon");

        TextView name = (TextView) rootView.findViewById(R.id.nombreDetailsPokemon);
        TextView peso = (TextView) rootView.findViewById(R.id.pesoDetailsPokemon);
        TextView hp = (TextView) rootView.findViewById(R.id.hpDetailsPokemon);
        TextView ataque = (TextView) rootView.findViewById(R.id.ataqueDetailsPokemon);
        TextView defensa = (TextView) rootView.findViewById(R.id.defensaDetailsPokemon);
        TextView tipo = (TextView) rootView.findViewById(R.id.tipoDetailsPokemon);

        if (id != -1){
            Cursor cursor = getContext().getContentResolver().query(
                    PokexiiiColumns.CONTENT_URI,
                    null,
                    PokexiiiColumns._ID+"=?",
                    new String[]{String.valueOf(id)},
                    null);
            PokexiiiCursor pokemon = new PokexiiiCursor(cursor);
            pokemon.moveToNext();

            name.setText(pokemon.getName());
            peso.setText(pokemon.getWeight());
            hp.setText(pokemon.getHp());
            ataque.setText(pokemon.getAttack().toString());
            defensa.setText(pokemon.getDefense());
            tipo.setText(pokemon.getTypes());
        }
        return rootView;
    }
}
