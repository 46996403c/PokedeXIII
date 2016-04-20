package oscarxiii.pokedexiii.provider;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;

import oscarxiii.pokedexiii.BuildConfig;
import oscarxiii.pokedexiii.provider.pokexiii.PokexiiiColumns;
import oscarxiii.pokedexiii.provider.typoxiii.TypoxiiiColumns;

public class PokemonSQLiteOpenHelper extends SQLiteOpenHelper {
    private static final String TAG = PokemonSQLiteOpenHelper.class.getSimpleName();

    public static final String DATABASE_FILE_NAME = "pokexiii.db";
    private static final int DATABASE_VERSION = 1;
    private static PokemonSQLiteOpenHelper sInstance;
    private final Context mContext;
    private final PokemonSQLiteOpenHelperCallbacks mOpenHelperCallbacks;

    // @formatter:off
    public static final String SQL_CREATE_TABLE_POKEXIII = "CREATE TABLE IF NOT EXISTS "
            + PokexiiiColumns.TABLE_NAME + " ( "
            + PokexiiiColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + PokexiiiColumns.PKDX_ID + " INTEGER, "
            + PokexiiiColumns.NAME + " TEXT, "
            + PokexiiiColumns.CATCH_RATE + " INTEGER, "
            + PokexiiiColumns.ATTACK + " INTEGER, "
            + PokexiiiColumns.DEFENSE + " TEXT, "
            + PokexiiiColumns.SPATK + " TEXT, "
            + PokexiiiColumns.SPDEF + " INTEGER, "
            + PokexiiiColumns.WEIGHT + " TEXT, "
            + PokexiiiColumns.SPEED + " INTEGER, "
            + PokexiiiColumns.HP + " TEXT, "
            + PokexiiiColumns.SYNCTIME + " TEXT, "
            + PokexiiiColumns.TYPES + " TEXT, "
            + PokexiiiColumns.IMAGE + " TEXT "
            + " );";

    public static final String SQL_CREATE_TABLE_TYPOXIII = "CREATE TABLE IF NOT EXISTS "
            + TypoxiiiColumns.TABLE_NAME + " ( "
            + TypoxiiiColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + TypoxiiiColumns.IYPO + " TEXT "
            + " );";

    // @formatter:on

    public static PokemonSQLiteOpenHelper getInstance(Context context) {
        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        // See this article for more information: http://bit.ly/6LRzfx
        if (sInstance == null) {
            sInstance = newInstance(context.getApplicationContext());
        }
        return sInstance;
    }

    private static PokemonSQLiteOpenHelper newInstance(Context context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
            return newInstancePreHoneycomb(context);
        }
        return newInstancePostHoneycomb(context);
    }


    /*
     * Pre Honeycomb.
     */
    private static PokemonSQLiteOpenHelper newInstancePreHoneycomb(Context context) {
        return new PokemonSQLiteOpenHelper(context);
    }

    private PokemonSQLiteOpenHelper(Context context) {
        super(context, DATABASE_FILE_NAME, null, DATABASE_VERSION);
        mContext = context;
        mOpenHelperCallbacks = new PokemonSQLiteOpenHelperCallbacks();
    }


    /*
     * Post Honeycomb.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private static PokemonSQLiteOpenHelper newInstancePostHoneycomb(Context context) {
        return new PokemonSQLiteOpenHelper(context, new DefaultDatabaseErrorHandler());
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private PokemonSQLiteOpenHelper(Context context, DatabaseErrorHandler errorHandler) {
        super(context, DATABASE_FILE_NAME, null, DATABASE_VERSION, errorHandler);
        mContext = context;
        mOpenHelperCallbacks = new PokemonSQLiteOpenHelperCallbacks();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        if (BuildConfig.DEBUG) Log.d(TAG, "onCreate");
        mOpenHelperCallbacks.onPreCreate(mContext, db);
        db.execSQL(SQL_CREATE_TABLE_POKEXIII);
        db.execSQL(SQL_CREATE_TABLE_TYPOXIII);
        mOpenHelperCallbacks.onPostCreate(mContext, db);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (!db.isReadOnly()) {
            setForeignKeyConstraintsEnabled(db);
        }
        mOpenHelperCallbacks.onOpen(mContext, db);
    }

    private void setForeignKeyConstraintsEnabled(SQLiteDatabase db) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
            setForeignKeyConstraintsEnabledPreJellyBean(db);
        } else {
            setForeignKeyConstraintsEnabledPostJellyBean(db);
        }
    }

    private void setForeignKeyConstraintsEnabledPreJellyBean(SQLiteDatabase db) {
        db.execSQL("PRAGMA foreign_keys=ON;");
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void setForeignKeyConstraintsEnabledPostJellyBean(SQLiteDatabase db) {
        db.setForeignKeyConstraintsEnabled(true);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        mOpenHelperCallbacks.onUpgrade(mContext, db, oldVersion, newVersion);
    }
}
