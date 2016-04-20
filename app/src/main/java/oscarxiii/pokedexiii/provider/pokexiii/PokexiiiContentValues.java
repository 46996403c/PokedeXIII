package oscarxiii.pokedexiii.provider.pokexiii;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.Nullable;

import oscarxiii.pokedexiii.provider.pokexiii.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code pokexiii} table.
 */
public class PokexiiiContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return PokexiiiColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable PokexiiiSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable PokexiiiSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public PokexiiiContentValues putPkdxId(@Nullable Integer value) {
        mContentValues.put(PokexiiiColumns.PKDX_ID, value);
        return this;
    }

    public PokexiiiContentValues putPkdxIdNull() {
        mContentValues.putNull(PokexiiiColumns.PKDX_ID);
        return this;
    }

    public PokexiiiContentValues putName(@Nullable String value) {
        mContentValues.put(PokexiiiColumns.NAME, value);
        return this;
    }

    public PokexiiiContentValues putNameNull() {
        mContentValues.putNull(PokexiiiColumns.NAME);
        return this;
    }

    public PokexiiiContentValues putCatchRate(@Nullable Integer value) {
        mContentValues.put(PokexiiiColumns.CATCH_RATE, value);
        return this;
    }

    public PokexiiiContentValues putCatchRateNull() {
        mContentValues.putNull(PokexiiiColumns.CATCH_RATE);
        return this;
    }

    public PokexiiiContentValues putAttack(@Nullable Integer value) {
        mContentValues.put(PokexiiiColumns.ATTACK, value);
        return this;
    }

    public PokexiiiContentValues putAttackNull() {
        mContentValues.putNull(PokexiiiColumns.ATTACK);
        return this;
    }

    public PokexiiiContentValues putDefense(@Nullable String value) {
        mContentValues.put(PokexiiiColumns.DEFENSE, value);
        return this;
    }

    public PokexiiiContentValues putDefenseNull() {
        mContentValues.putNull(PokexiiiColumns.DEFENSE);
        return this;
    }

    public PokexiiiContentValues putSpatk(@Nullable String value) {
        mContentValues.put(PokexiiiColumns.SPATK, value);
        return this;
    }

    public PokexiiiContentValues putSpatkNull() {
        mContentValues.putNull(PokexiiiColumns.SPATK);
        return this;
    }

    public PokexiiiContentValues putSpdef(@Nullable Integer value) {
        mContentValues.put(PokexiiiColumns.SPDEF, value);
        return this;
    }

    public PokexiiiContentValues putSpdefNull() {
        mContentValues.putNull(PokexiiiColumns.SPDEF);
        return this;
    }

    public PokexiiiContentValues putWeight(@Nullable String value) {
        mContentValues.put(PokexiiiColumns.WEIGHT, value);
        return this;
    }

    public PokexiiiContentValues putWeightNull() {
        mContentValues.putNull(PokexiiiColumns.WEIGHT);
        return this;
    }

    public PokexiiiContentValues putSpeed(@Nullable Integer value) {
        mContentValues.put(PokexiiiColumns.SPEED, value);
        return this;
    }

    public PokexiiiContentValues putSpeedNull() {
        mContentValues.putNull(PokexiiiColumns.SPEED);
        return this;
    }

    public PokexiiiContentValues putHp(@Nullable String value) {
        mContentValues.put(PokexiiiColumns.HP, value);
        return this;
    }

    public PokexiiiContentValues putHpNull() {
        mContentValues.putNull(PokexiiiColumns.HP);
        return this;
    }

    public PokexiiiContentValues putSynctime(@Nullable String value) {
        mContentValues.put(PokexiiiColumns.SYNCTIME, value);
        return this;
    }

    public PokexiiiContentValues putSynctimeNull() {
        mContentValues.putNull(PokexiiiColumns.SYNCTIME);
        return this;
    }

    public PokexiiiContentValues putTypes(@Nullable String value) {
        mContentValues.put(PokexiiiColumns.TYPES, value);
        return this;
    }

    public PokexiiiContentValues putTypesNull() {
        mContentValues.putNull(PokexiiiColumns.TYPES);
        return this;
    }

    public PokexiiiContentValues putImage(@Nullable String value) {
        mContentValues.put(PokexiiiColumns.IMAGE, value);
        return this;
    }

    public PokexiiiContentValues putImageNull() {
        mContentValues.putNull(PokexiiiColumns.IMAGE);
        return this;
    }
}
