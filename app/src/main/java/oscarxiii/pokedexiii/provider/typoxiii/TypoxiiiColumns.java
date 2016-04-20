package oscarxiii.pokedexiii.provider.typoxiii;

import android.net.Uri;
import android.provider.BaseColumns;

import oscarxiii.pokedexiii.provider.PokemonProvider;
import oscarxiii.pokedexiii.provider.pokexiii.PokexiiiColumns;
import oscarxiii.pokedexiii.provider.typoxiii.TypoxiiiColumns;

/**
 * Columns for the {@code typoxiii} table.
 */
public class TypoxiiiColumns implements BaseColumns {
    public static final String TABLE_NAME = "typoxiii";
    public static final Uri CONTENT_URI = Uri.parse(PokemonProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    public static final String IYPO = "iypo";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            IYPO
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(IYPO) || c.contains("." + IYPO)) return true;
        }
        return false;
    }

}
