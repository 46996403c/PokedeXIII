package oscarxiii.pokedexiii.provider;

import java.util.Arrays;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.util.Log;

import oscarxiii.pokedexiii.BuildConfig;
import oscarxiii.pokedexiii.provider.pokexiii.base.BaseContentProvider;
import oscarxiii.pokedexiii.provider.pokexiii.PokexiiiColumns;
import oscarxiii.pokedexiii.provider.typoxiii.TypoxiiiColumns;

public class PokemonProvider extends BaseContentProvider {
    private static final String TAG = PokemonProvider.class.getSimpleName();

    private static final boolean DEBUG = BuildConfig.DEBUG;

    private static final String TYPE_CURSOR_ITEM = "vnd.android.cursor.item/";
    private static final String TYPE_CURSOR_DIR = "vnd.android.cursor.dir/";

    public static final String AUTHORITY = "oscarxiii.pokedexiii.provider";
    public static final String CONTENT_URI_BASE = "content://" + AUTHORITY;

    private static final int URI_TYPE_POKEXIII = 0;
    private static final int URI_TYPE_POKEXIII_ID = 1;

    private static final int URI_TYPE_TYPOXIII = 2;
    private static final int URI_TYPE_TYPOXIII_ID = 3;



    private static final UriMatcher URI_MATCHER = new UriMatcher(UriMatcher.NO_MATCH);

    static {
        URI_MATCHER.addURI(AUTHORITY, PokexiiiColumns.TABLE_NAME, URI_TYPE_POKEXIII);
        URI_MATCHER.addURI(AUTHORITY, PokexiiiColumns.TABLE_NAME + "/#", URI_TYPE_POKEXIII_ID);
        URI_MATCHER.addURI(AUTHORITY, TypoxiiiColumns.TABLE_NAME, URI_TYPE_TYPOXIII);
        URI_MATCHER.addURI(AUTHORITY, TypoxiiiColumns.TABLE_NAME + "/#", URI_TYPE_TYPOXIII_ID);
    }

    @Override
    protected SQLiteOpenHelper createSqLiteOpenHelper() {
        return PokemonSQLiteOpenHelper.getInstance(getContext());
    }

    @Override
    protected boolean hasDebug() {
        return DEBUG;
    }

    @Override
    public String getType(Uri uri) {
        int match = URI_MATCHER.match(uri);
        switch (match) {
            case URI_TYPE_POKEXIII:
                return TYPE_CURSOR_DIR + PokexiiiColumns.TABLE_NAME;
            case URI_TYPE_POKEXIII_ID:
                return TYPE_CURSOR_ITEM + PokexiiiColumns.TABLE_NAME;

            case URI_TYPE_TYPOXIII:
                return TYPE_CURSOR_DIR + TypoxiiiColumns.TABLE_NAME;
            case URI_TYPE_TYPOXIII_ID:
                return TYPE_CURSOR_ITEM + TypoxiiiColumns.TABLE_NAME;

        }
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        if (DEBUG) Log.d(TAG, "insert uri=" + uri + " values=" + values);
        return super.insert(uri, values);
    }

    @Override
    public int bulkInsert(Uri uri, ContentValues[] values) {
        if (DEBUG) Log.d(TAG, "bulkInsert uri=" + uri + " values.length=" + values.length);
        return super.bulkInsert(uri, values);
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        if (DEBUG) Log.d(TAG, "update uri=" + uri + " values=" + values + " selection=" + selection + " selectionArgs=" + Arrays.toString(selectionArgs));
        return super.update(uri, values, selection, selectionArgs);
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        if (DEBUG) Log.d(TAG, "delete uri=" + uri + " selection=" + selection + " selectionArgs=" + Arrays.toString(selectionArgs));
        return super.delete(uri, selection, selectionArgs);
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        if (DEBUG)
            Log.d(TAG, "query uri=" + uri + " selection=" + selection + " selectionArgs=" + Arrays.toString(selectionArgs) + " sortOrder=" + sortOrder
                    + " groupBy=" + uri.getQueryParameter(QUERY_GROUP_BY) + " having=" + uri.getQueryParameter(QUERY_HAVING) + " limit=" + uri.getQueryParameter(QUERY_LIMIT));
        return super.query(uri, projection, selection, selectionArgs, sortOrder);
    }

    @Override
    protected QueryParams getQueryParams(Uri uri, String selection, String[] projection) {
        QueryParams res = new QueryParams();
        String id = null;
        int matchedId = URI_MATCHER.match(uri);
        switch (matchedId) {
            case URI_TYPE_POKEXIII:
            case URI_TYPE_POKEXIII_ID:
                res.table = PokexiiiColumns.TABLE_NAME;
                res.idColumn = PokexiiiColumns._ID;
                res.tablesWithJoins = PokexiiiColumns.TABLE_NAME;
                res.orderBy = PokexiiiColumns.DEFAULT_ORDER;
                break;

            case URI_TYPE_TYPOXIII:
            case URI_TYPE_TYPOXIII_ID:
                res.table = TypoxiiiColumns.TABLE_NAME;
                res.idColumn = TypoxiiiColumns._ID;
                res.tablesWithJoins = TypoxiiiColumns.TABLE_NAME;
                res.orderBy = TypoxiiiColumns.DEFAULT_ORDER;
                break;

            default:
                throw new IllegalArgumentException("The uri '" + uri + "' is not supported by this ContentProvider");
        }

        switch (matchedId) {
            case URI_TYPE_POKEXIII_ID:
            case URI_TYPE_TYPOXIII_ID:
                id = uri.getLastPathSegment();
        }
        if (id != null) {
            if (selection != null) {
                res.selection = res.table + "." + res.idColumn + "=" + id + " and (" + selection + ")";
            } else {
                res.selection = res.table + "." + res.idColumn + "=" + id;
            }
        } else {
            res.selection = selection;
        }
        return res;
    }
}
