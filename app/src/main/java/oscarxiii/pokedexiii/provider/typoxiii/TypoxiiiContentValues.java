package oscarxiii.pokedexiii.provider.typoxiii;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import oscarxiii.pokedexiii.provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code typoxiii} table.
 */
public class TypoxiiiContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return TypoxiiiColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable TypoxiiiSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable TypoxiiiSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public TypoxiiiContentValues putIypo(@Nullable String value) {
        mContentValues.put(TypoxiiiColumns.IYPO, value);
        return this;
    }

    public TypoxiiiContentValues putIypoNull() {
        mContentValues.putNull(TypoxiiiColumns.IYPO);
        return this;
    }
}
