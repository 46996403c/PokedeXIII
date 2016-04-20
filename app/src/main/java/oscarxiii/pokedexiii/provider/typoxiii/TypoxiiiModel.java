package oscarxiii.pokedexiii.provider.typoxiii;

import oscarxiii.pokedexiii.provider.base.BaseModel;

import java.util.Date;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Data model for the {@code typoxiii} table.
 */
public interface TypoxiiiModel extends BaseModel {

    /**
     * Get the {@code iypo} value.
     * Can be {@code null}.
     */
    @Nullable
    String getIypo();
}
