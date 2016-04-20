package oscarxiii.pokedexiii;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import oscarxiii.pokedexiii.provider.typoxiii.TypoxiiiCursor;

public class AdapterTypePokemon extends SimpleCursorAdapter {
    private final Context context;

    public AdapterTypePokemon(Context context, int layaout, Cursor c, String[] from, int[] to, int flags) {
        super(context,layaout, c, from, to, flags);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Cursor cursor = getCursor();
        TypoxiiiCursor typecursor = new TypoxiiiCursor(cursor);
        typecursor.moveToPosition(position);

        if(convertView==null){
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.type_pokemon_adapter, parent, false);
        }
        TextView typo = (TextView) convertView.findViewById(R.id.pokemonTipo);
        typo.setText(typecursor.getIypo());

        return convertView;
    }
}