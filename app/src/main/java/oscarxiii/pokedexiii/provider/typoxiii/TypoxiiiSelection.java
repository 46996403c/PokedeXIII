package oscarxiii.pokedexiii.provider.typoxiii;

import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import oscarxiii.pokedexiii.provider.base.AbstractSelection;

/**
 * Selection for the {@code typoxiii} table.
 */
public class TypoxiiiSelection extends AbstractSelection<TypoxiiiSelection> {
    @Override
    protected Uri baseUri() {
        return TypoxiiiColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code TypoxiiiCursor} object, which is positioned before the first entry, or null.
     */
    public TypoxiiiCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new TypoxiiiCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public TypoxiiiCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code TypoxiiiCursor} object, which is positioned before the first entry, or null.
     */
    public TypoxiiiCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new TypoxiiiCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public TypoxiiiCursor query(Context context) {
        return query(context, null);
    }


    public TypoxiiiSelection id(long... value) {
        addEquals("typoxiii." + TypoxiiiColumns._ID, toObjectArray(value));
        return this;
    }

    public TypoxiiiSelection idNot(long... value) {
        addNotEquals("typoxiii." + TypoxiiiColumns._ID, toObjectArray(value));
        return this;
    }

    public TypoxiiiSelection orderById(boolean desc) {
        orderBy("typoxiii." + TypoxiiiColumns._ID, desc);
        return this;
    }

    public TypoxiiiSelection orderById() {
        return orderById(false);
    }

    public TypoxiiiSelection iypo(String... value) {
        addEquals(TypoxiiiColumns.IYPO, value);
        return this;
    }

    public TypoxiiiSelection iypoNot(String... value) {
        addNotEquals(TypoxiiiColumns.IYPO, value);
        return this;
    }

    public TypoxiiiSelection iypoLike(String... value) {
        addLike(TypoxiiiColumns.IYPO, value);
        return this;
    }

    public TypoxiiiSelection iypoContains(String... value) {
        addContains(TypoxiiiColumns.IYPO, value);
        return this;
    }

    public TypoxiiiSelection iypoStartsWith(String... value) {
        addStartsWith(TypoxiiiColumns.IYPO, value);
        return this;
    }

    public TypoxiiiSelection iypoEndsWith(String... value) {
        addEndsWith(TypoxiiiColumns.IYPO, value);
        return this;
    }

    public TypoxiiiSelection orderByIypo(boolean desc) {
        orderBy(TypoxiiiColumns.IYPO, desc);
        return this;
    }

    public TypoxiiiSelection orderByIypo() {
        orderBy(TypoxiiiColumns.IYPO, false);
        return this;
    }
}
