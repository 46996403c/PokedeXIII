package oscarxiii.pokedexiii.provider.pokexiii;

import android.database.Cursor;
import android.support.annotation.Nullable;

import oscarxiii.pokedexiii.provider.pokexiii.base.AbstractCursor;

/**
 * Cursor wrapper for the {@code pokexiii} table.
 */
public class PokexiiiCursor extends AbstractCursor implements PokexiiiModel {
    public PokexiiiCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(PokexiiiColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code pkdx_id} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getPkdxId() {
        Integer res = getIntegerOrNull(PokexiiiColumns.PKDX_ID);
        return res;
    }

    /**
     * Get the {@code name} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getName() {
        String res = getStringOrNull(PokexiiiColumns.NAME);
        return res;
    }

    /**
     * Get the {@code catch_rate} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getCatchRate() {
        Integer res = getIntegerOrNull(PokexiiiColumns.CATCH_RATE);
        return res;
    }

    /**
     * Get the {@code attack} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getAttack() {
        Integer res = getIntegerOrNull(PokexiiiColumns.ATTACK);
        return res;
    }

    /**
     * Get the {@code defense} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getDefense() {
        String res = getStringOrNull(PokexiiiColumns.DEFENSE);
        return res;
    }

    /**
     * Get the {@code spatk} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getSpatk() {
        String res = getStringOrNull(PokexiiiColumns.SPATK);
        return res;
    }

    /**
     * Get the {@code spdef} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getSpdef() {
        Integer res = getIntegerOrNull(PokexiiiColumns.SPDEF);
        return res;
    }

    /**
     * Get the {@code weight} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getWeight() {
        String res = getStringOrNull(PokexiiiColumns.WEIGHT);
        return res;
    }

    /**
     * Get the {@code speed} value.
     * Can be {@code null}.
     */
    @Nullable
    public Integer getSpeed() {
        Integer res = getIntegerOrNull(PokexiiiColumns.SPEED);
        return res;
    }

    /**
     * Get the {@code hp} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getHp() {
        String res = getStringOrNull(PokexiiiColumns.HP);
        return res;
    }

    /**
     * Get the {@code synctime} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getSynctime() {
        String res = getStringOrNull(PokexiiiColumns.SYNCTIME);
        return res;
    }

    /**
     * Get the {@code types} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getTypes() {
        String res = getStringOrNull(PokexiiiColumns.TYPES);
        return res;
    }

    /**
     * Get the {@code image} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getImage() {
        String res = getStringOrNull(PokexiiiColumns.IMAGE);
        return res;
    }
}
