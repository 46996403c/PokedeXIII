package oscarxiii.pokedexiii.provider.typoxiii;

import java.util.Date;

import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import oscarxiii.pokedexiii.provider.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code typoxiii} table.
 */
public class TypoxiiiCursor extends AbstractCursor implements TypoxiiiModel {
    public TypoxiiiCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(TypoxiiiColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code iypo} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getIypo() {
        String res = getStringOrNull(TypoxiiiColumns.IYPO);
        return res;
    }
}
