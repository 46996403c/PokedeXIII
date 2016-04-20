package oscarxiii.pokedexiii.provider.pokexiii;

import oscarxiii.pokedexiii.provider.pokexiii.base.BaseModel;

import android.support.annotation.Nullable;

/**
 * Data model for the {@code pokexiii} table.
 */
public interface PokexiiiModel extends BaseModel {

    /**
     * Get the {@code pkdx_id} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getPkdxId();

    /**
     * Get the {@code name} value.
     * Can be {@code null}.
     */
    @Nullable
    String getName();

    /**
     * Get the {@code catch_rate} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getCatchRate();

    /**
     * Get the {@code attack} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getAttack();

    /**
     * Get the {@code defense} value.
     * Can be {@code null}.
     */
    @Nullable
    String getDefense();

    /**
     * Get the {@code spatk} value.
     * Can be {@code null}.
     */
    @Nullable
    String getSpatk();

    /**
     * Get the {@code spdef} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getSpdef();

    /**
     * Get the {@code weight} value.
     * Can be {@code null}.
     */
    @Nullable
    String getWeight();

    /**
     * Get the {@code speed} value.
     * Can be {@code null}.
     */
    @Nullable
    Integer getSpeed();

    /**
     * Get the {@code hp} value.
     * Can be {@code null}.
     */
    @Nullable
    String getHp();

    /**
     * Get the {@code synctime} value.
     * Can be {@code null}.
     */
    @Nullable
    String getSynctime();

    /**
     * Get the {@code types} value.
     * Can be {@code null}.
     */
    @Nullable
    String getTypes();

    /**
     * Get the {@code image} value.
     * Can be {@code null}.
     */
    @Nullable
    String getImage();
}
