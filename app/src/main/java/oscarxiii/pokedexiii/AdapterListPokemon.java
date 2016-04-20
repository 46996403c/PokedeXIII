package oscarxiii.pokedexiii;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import oscarxiii.pokedexiii.provider.pokexiii.PokexiiiCursor;

public class AdapterListPokemon extends SimpleCursorAdapter {
    private final Context context;

    public AdapterListPokemon(Context context, int layaout, Cursor c, String[] from, int[] to, int flags) {
        super(context,layaout, c, from, to, flags);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Cursor cursor = getCursor();
        PokexiiiCursor pokecursor = new PokexiiiCursor(cursor);
        pokecursor.moveToPosition(position);

        if(convertView==null){
            LayoutInflater inflater = LayoutInflater.from(context);
           convertView = inflater.inflate(R.layout.lista_pokemon_adapter, parent, false);
        }
        TextView name = (TextView) convertView.findViewById(R.id.pokemonTipo);
        ImageView imagePokemon =(ImageView) convertView.findViewById(R.id.imagePokemon);

        name.setText(pokecursor.getName());

        Picasso.with(context)
                .load("http://pokeapi.co/media/img/"+pokecursor.getPkdxId()+".png")
                .fit()
                .into(imagePokemon);

        return convertView;
    }
}