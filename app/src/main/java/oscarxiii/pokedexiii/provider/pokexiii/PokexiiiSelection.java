package oscarxiii.pokedexiii.provider.pokexiii;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import oscarxiii.pokedexiii.provider.pokexiii.base.AbstractSelection;

/**
 * Selection for the {@code pokexiii} table.
 */
public class PokexiiiSelection extends AbstractSelection<PokexiiiSelection> {
    @Override
    protected Uri baseUri() {
        return PokexiiiColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code PokexiiiCursor} object, which is positioned before the first entry, or null.
     */
    public PokexiiiCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new PokexiiiCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public PokexiiiCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code PokexiiiCursor} object, which is positioned before the first entry, or null.
     */
    public PokexiiiCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new PokexiiiCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public PokexiiiCursor query(Context context) {
        return query(context, null);
    }


    public PokexiiiSelection id(long... value) {
        addEquals("pokexiii." + PokexiiiColumns._ID, toObjectArray(value));
        return this;
    }

    public PokexiiiSelection idNot(long... value) {
        addNotEquals("pokexiii." + PokexiiiColumns._ID, toObjectArray(value));
        return this;
    }

    public PokexiiiSelection orderById(boolean desc) {
        orderBy("pokexiii." + PokexiiiColumns._ID, desc);
        return this;
    }

    public PokexiiiSelection orderById() {
        return orderById(false);
    }

    public PokexiiiSelection pkdxId(Integer... value) {
        addEquals(PokexiiiColumns.PKDX_ID, value);
        return this;
    }

    public PokexiiiSelection pkdxIdNot(Integer... value) {
        addNotEquals(PokexiiiColumns.PKDX_ID, value);
        return this;
    }

    public PokexiiiSelection pkdxIdGt(int value) {
        addGreaterThan(PokexiiiColumns.PKDX_ID, value);
        return this;
    }

    public PokexiiiSelection pkdxIdGtEq(int value) {
        addGreaterThanOrEquals(PokexiiiColumns.PKDX_ID, value);
        return this;
    }

    public PokexiiiSelection pkdxIdLt(int value) {
        addLessThan(PokexiiiColumns.PKDX_ID, value);
        return this;
    }

    public PokexiiiSelection pkdxIdLtEq(int value) {
        addLessThanOrEquals(PokexiiiColumns.PKDX_ID, value);
        return this;
    }

    public PokexiiiSelection orderByPkdxId(boolean desc) {
        orderBy(PokexiiiColumns.PKDX_ID, desc);
        return this;
    }

    public PokexiiiSelection orderByPkdxId() {
        orderBy(PokexiiiColumns.PKDX_ID, false);
        return this;
    }

    public PokexiiiSelection name(String... value) {
        addEquals(PokexiiiColumns.NAME, value);
        return this;
    }

    public PokexiiiSelection nameNot(String... value) {
        addNotEquals(PokexiiiColumns.NAME, value);
        return this;
    }

    public PokexiiiSelection nameLike(String... value) {
        addLike(PokexiiiColumns.NAME, value);
        return this;
    }

    public PokexiiiSelection nameContains(String... value) {
        addContains(PokexiiiColumns.NAME, value);
        return this;
    }

    public PokexiiiSelection nameStartsWith(String... value) {
        addStartsWith(PokexiiiColumns.NAME, value);
        return this;
    }

    public PokexiiiSelection nameEndsWith(String... value) {
        addEndsWith(PokexiiiColumns.NAME, value);
        return this;
    }

    public PokexiiiSelection orderByName(boolean desc) {
        orderBy(PokexiiiColumns.NAME, desc);
        return this;
    }

    public PokexiiiSelection orderByName() {
        orderBy(PokexiiiColumns.NAME, false);
        return this;
    }

    public PokexiiiSelection catchRate(Integer... value) {
        addEquals(PokexiiiColumns.CATCH_RATE, value);
        return this;
    }

    public PokexiiiSelection catchRateNot(Integer... value) {
        addNotEquals(PokexiiiColumns.CATCH_RATE, value);
        return this;
    }

    public PokexiiiSelection catchRateGt(int value) {
        addGreaterThan(PokexiiiColumns.CATCH_RATE, value);
        return this;
    }

    public PokexiiiSelection catchRateGtEq(int value) {
        addGreaterThanOrEquals(PokexiiiColumns.CATCH_RATE, value);
        return this;
    }

    public PokexiiiSelection catchRateLt(int value) {
        addLessThan(PokexiiiColumns.CATCH_RATE, value);
        return this;
    }

    public PokexiiiSelection catchRateLtEq(int value) {
        addLessThanOrEquals(PokexiiiColumns.CATCH_RATE, value);
        return this;
    }

    public PokexiiiSelection orderByCatchRate(boolean desc) {
        orderBy(PokexiiiColumns.CATCH_RATE, desc);
        return this;
    }

    public PokexiiiSelection orderByCatchRate() {
        orderBy(PokexiiiColumns.CATCH_RATE, false);
        return this;
    }

    public PokexiiiSelection attack(Integer... value) {
        addEquals(PokexiiiColumns.ATTACK, value);
        return this;
    }

    public PokexiiiSelection attackNot(Integer... value) {
        addNotEquals(PokexiiiColumns.ATTACK, value);
        return this;
    }

    public PokexiiiSelection attackGt(int value) {
        addGreaterThan(PokexiiiColumns.ATTACK, value);
        return this;
    }

    public PokexiiiSelection attackGtEq(int value) {
        addGreaterThanOrEquals(PokexiiiColumns.ATTACK, value);
        return this;
    }

    public PokexiiiSelection attackLt(int value) {
        addLessThan(PokexiiiColumns.ATTACK, value);
        return this;
    }

    public PokexiiiSelection attackLtEq(int value) {
        addLessThanOrEquals(PokexiiiColumns.ATTACK, value);
        return this;
    }

    public PokexiiiSelection orderByAttack(boolean desc) {
        orderBy(PokexiiiColumns.ATTACK, desc);
        return this;
    }

    public PokexiiiSelection orderByAttack() {
        orderBy(PokexiiiColumns.ATTACK, false);
        return this;
    }

    public PokexiiiSelection defense(String... value) {
        addEquals(PokexiiiColumns.DEFENSE, value);
        return this;
    }

    public PokexiiiSelection defenseNot(String... value) {
        addNotEquals(PokexiiiColumns.DEFENSE, value);
        return this;
    }

    public PokexiiiSelection defenseLike(String... value) {
        addLike(PokexiiiColumns.DEFENSE, value);
        return this;
    }

    public PokexiiiSelection defenseContains(String... value) {
        addContains(PokexiiiColumns.DEFENSE, value);
        return this;
    }

    public PokexiiiSelection defenseStartsWith(String... value) {
        addStartsWith(PokexiiiColumns.DEFENSE, value);
        return this;
    }

    public PokexiiiSelection defenseEndsWith(String... value) {
        addEndsWith(PokexiiiColumns.DEFENSE, value);
        return this;
    }

    public PokexiiiSelection orderByDefense(boolean desc) {
        orderBy(PokexiiiColumns.DEFENSE, desc);
        return this;
    }

    public PokexiiiSelection orderByDefense() {
        orderBy(PokexiiiColumns.DEFENSE, false);
        return this;
    }

    public PokexiiiSelection spatk(String... value) {
        addEquals(PokexiiiColumns.SPATK, value);
        return this;
    }

    public PokexiiiSelection spatkNot(String... value) {
        addNotEquals(PokexiiiColumns.SPATK, value);
        return this;
    }

    public PokexiiiSelection spatkLike(String... value) {
        addLike(PokexiiiColumns.SPATK, value);
        return this;
    }

    public PokexiiiSelection spatkContains(String... value) {
        addContains(PokexiiiColumns.SPATK, value);
        return this;
    }

    public PokexiiiSelection spatkStartsWith(String... value) {
        addStartsWith(PokexiiiColumns.SPATK, value);
        return this;
    }

    public PokexiiiSelection spatkEndsWith(String... value) {
        addEndsWith(PokexiiiColumns.SPATK, value);
        return this;
    }

    public PokexiiiSelection orderBySpatk(boolean desc) {
        orderBy(PokexiiiColumns.SPATK, desc);
        return this;
    }

    public PokexiiiSelection orderBySpatk() {
        orderBy(PokexiiiColumns.SPATK, false);
        return this;
    }

    public PokexiiiSelection spdef(Integer... value) {
        addEquals(PokexiiiColumns.SPDEF, value);
        return this;
    }

    public PokexiiiSelection spdefNot(Integer... value) {
        addNotEquals(PokexiiiColumns.SPDEF, value);
        return this;
    }

    public PokexiiiSelection spdefGt(int value) {
        addGreaterThan(PokexiiiColumns.SPDEF, value);
        return this;
    }

    public PokexiiiSelection spdefGtEq(int value) {
        addGreaterThanOrEquals(PokexiiiColumns.SPDEF, value);
        return this;
    }

    public PokexiiiSelection spdefLt(int value) {
        addLessThan(PokexiiiColumns.SPDEF, value);
        return this;
    }

    public PokexiiiSelection spdefLtEq(int value) {
        addLessThanOrEquals(PokexiiiColumns.SPDEF, value);
        return this;
    }

    public PokexiiiSelection orderBySpdef(boolean desc) {
        orderBy(PokexiiiColumns.SPDEF, desc);
        return this;
    }

    public PokexiiiSelection orderBySpdef() {
        orderBy(PokexiiiColumns.SPDEF, false);
        return this;
    }

    public PokexiiiSelection weight(String... value) {
        addEquals(PokexiiiColumns.WEIGHT, value);
        return this;
    }

    public PokexiiiSelection weightNot(String... value) {
        addNotEquals(PokexiiiColumns.WEIGHT, value);
        return this;
    }

    public PokexiiiSelection weightLike(String... value) {
        addLike(PokexiiiColumns.WEIGHT, value);
        return this;
    }

    public PokexiiiSelection weightContains(String... value) {
        addContains(PokexiiiColumns.WEIGHT, value);
        return this;
    }

    public PokexiiiSelection weightStartsWith(String... value) {
        addStartsWith(PokexiiiColumns.WEIGHT, value);
        return this;
    }

    public PokexiiiSelection weightEndsWith(String... value) {
        addEndsWith(PokexiiiColumns.WEIGHT, value);
        return this;
    }

    public PokexiiiSelection orderByWeight(boolean desc) {
        orderBy(PokexiiiColumns.WEIGHT, desc);
        return this;
    }

    public PokexiiiSelection orderByWeight() {
        orderBy(PokexiiiColumns.WEIGHT, false);
        return this;
    }

    public PokexiiiSelection speed(Integer... value) {
        addEquals(PokexiiiColumns.SPEED, value);
        return this;
    }

    public PokexiiiSelection speedNot(Integer... value) {
        addNotEquals(PokexiiiColumns.SPEED, value);
        return this;
    }

    public PokexiiiSelection speedGt(int value) {
        addGreaterThan(PokexiiiColumns.SPEED, value);
        return this;
    }

    public PokexiiiSelection speedGtEq(int value) {
        addGreaterThanOrEquals(PokexiiiColumns.SPEED, value);
        return this;
    }

    public PokexiiiSelection speedLt(int value) {
        addLessThan(PokexiiiColumns.SPEED, value);
        return this;
    }

    public PokexiiiSelection speedLtEq(int value) {
        addLessThanOrEquals(PokexiiiColumns.SPEED, value);
        return this;
    }

    public PokexiiiSelection orderBySpeed(boolean desc) {
        orderBy(PokexiiiColumns.SPEED, desc);
        return this;
    }

    public PokexiiiSelection orderBySpeed() {
        orderBy(PokexiiiColumns.SPEED, false);
        return this;
    }

    public PokexiiiSelection hp(String... value) {
        addEquals(PokexiiiColumns.HP, value);
        return this;
    }

    public PokexiiiSelection hpNot(String... value) {
        addNotEquals(PokexiiiColumns.HP, value);
        return this;
    }

    public PokexiiiSelection hpLike(String... value) {
        addLike(PokexiiiColumns.HP, value);
        return this;
    }

    public PokexiiiSelection hpContains(String... value) {
        addContains(PokexiiiColumns.HP, value);
        return this;
    }

    public PokexiiiSelection hpStartsWith(String... value) {
        addStartsWith(PokexiiiColumns.HP, value);
        return this;
    }

    public PokexiiiSelection hpEndsWith(String... value) {
        addEndsWith(PokexiiiColumns.HP, value);
        return this;
    }

    public PokexiiiSelection orderByHp(boolean desc) {
        orderBy(PokexiiiColumns.HP, desc);
        return this;
    }

    public PokexiiiSelection orderByHp() {
        orderBy(PokexiiiColumns.HP, false);
        return this;
    }

    public PokexiiiSelection synctime(String... value) {
        addEquals(PokexiiiColumns.SYNCTIME, value);
        return this;
    }

    public PokexiiiSelection synctimeNot(String... value) {
        addNotEquals(PokexiiiColumns.SYNCTIME, value);
        return this;
    }

    public PokexiiiSelection synctimeLike(String... value) {
        addLike(PokexiiiColumns.SYNCTIME, value);
        return this;
    }

    public PokexiiiSelection synctimeContains(String... value) {
        addContains(PokexiiiColumns.SYNCTIME, value);
        return this;
    }

    public PokexiiiSelection synctimeStartsWith(String... value) {
        addStartsWith(PokexiiiColumns.SYNCTIME, value);
        return this;
    }

    public PokexiiiSelection synctimeEndsWith(String... value) {
        addEndsWith(PokexiiiColumns.SYNCTIME, value);
        return this;
    }

    public PokexiiiSelection orderBySynctime(boolean desc) {
        orderBy(PokexiiiColumns.SYNCTIME, desc);
        return this;
    }

    public PokexiiiSelection orderBySynctime() {
        orderBy(PokexiiiColumns.SYNCTIME, false);
        return this;
    }

    public PokexiiiSelection types(String... value) {
        addEquals(PokexiiiColumns.TYPES, value);
        return this;
    }

    public PokexiiiSelection typesNot(String... value) {
        addNotEquals(PokexiiiColumns.TYPES, value);
        return this;
    }

    public PokexiiiSelection typesLike(String... value) {
        addLike(PokexiiiColumns.TYPES, value);
        return this;
    }

    public PokexiiiSelection typesContains(String... value) {
        addContains(PokexiiiColumns.TYPES, value);
        return this;
    }

    public PokexiiiSelection typesStartsWith(String... value) {
        addStartsWith(PokexiiiColumns.TYPES, value);
        return this;
    }

    public PokexiiiSelection typesEndsWith(String... value) {
        addEndsWith(PokexiiiColumns.TYPES, value);
        return this;
    }

    public PokexiiiSelection orderByTypes(boolean desc) {
        orderBy(PokexiiiColumns.TYPES, desc);
        return this;
    }

    public PokexiiiSelection orderByTypes() {
        orderBy(PokexiiiColumns.TYPES, false);
        return this;
    }

    public PokexiiiSelection image(String... value) {
        addEquals(PokexiiiColumns.IMAGE, value);
        return this;
    }

    public PokexiiiSelection imageNot(String... value) {
        addNotEquals(PokexiiiColumns.IMAGE, value);
        return this;
    }

    public PokexiiiSelection imageLike(String... value) {
        addLike(PokexiiiColumns.IMAGE, value);
        return this;
    }

    public PokexiiiSelection imageContains(String... value) {
        addContains(PokexiiiColumns.IMAGE, value);
        return this;
    }

    public PokexiiiSelection imageStartsWith(String... value) {
        addStartsWith(PokexiiiColumns.IMAGE, value);
        return this;
    }

    public PokexiiiSelection imageEndsWith(String... value) {
        addEndsWith(PokexiiiColumns.IMAGE, value);
        return this;
    }

    public PokexiiiSelection orderByImage(boolean desc) {
        orderBy(PokexiiiColumns.IMAGE, desc);
        return this;
    }

    public PokexiiiSelection orderByImage() {
        orderBy(PokexiiiColumns.IMAGE, false);
        return this;
    }
}
