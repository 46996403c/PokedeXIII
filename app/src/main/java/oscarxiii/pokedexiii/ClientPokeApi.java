package oscarxiii.pokedexiii;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import oscarxiii.pokedexiii.json.Pokemon;
import oscarxiii.pokedexiii.json.Types;
import oscarxiii.pokedexiii.provider.pokexiii.PokexiiiColumns;
import oscarxiii.pokedexiii.provider.pokexiii.PokexiiiContentValues;
import oscarxiii.pokedexiii.provider.typoxiii.TypoxiiiColumns;
import oscarxiii.pokedexiii.provider.typoxiii.TypoxiiiContentValues;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Path;

public class ClientPokeApi {
    private final Context context;
    final String BASE_URL = "http://pokeapi.co/api/v2/";
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    InterficiePokeApi service = retrofit.create(InterficiePokeApi.class);

    public ClientPokeApi(Context context){
        super();
        this.context=context;
    }

    public void getPokemon(){
        for (int i =1; i<50; i++) {
            Call<Pokemon> advtCall = service.pokemons(String.valueOf(i));

            advtCall.enqueue(new Callback<Pokemon>() {
                @Override
                public void onResponse(Response<Pokemon> response, Retrofit retrofit) {
                    if (response.isSuccess()) {
                        Pokemon pokemon = response.body();

                        ContentValues[] bulkToInsert;
                        List<ContentValues> pValueList = new ArrayList<>();

                        PokexiiiContentValues values = new PokexiiiContentValues();

                        values.putPkdxId(pokemon.getId());
                        values.putName(pokemon.getName());
                        values.putWeight(pokemon.getWeight().toString());
                        values.putHp(String.valueOf(pokemon.getStats().get(5).getBase_stat()));
                        values.putDefense(String.valueOf(pokemon.getStats().get(3).getBase_stat()));
                        values.putAttack(pokemon.getStats().get(4).getBase_stat());
                        values.putTypes(pokemon.getTypes().get(0).getType().getName());

                        pValueList.add(values.values());

                        bulkToInsert = new ContentValues[pValueList.size()];
                        pValueList.toArray(bulkToInsert);
                        context.getContentResolver().bulkInsert(PokexiiiColumns.CONTENT_URI, bulkToInsert);
                    }
                }

                @Override
                public void onFailure(Throwable t) {
                    Log.w(null, Arrays.toString(t.getStackTrace()));
                }
            });
        }
    }

    public void getType(){
        for (int i=1; i<18; i++) {
            Call<Types> advtCall = service.type(String.valueOf(i));

            advtCall.enqueue(new Callback<Types>() {
                @Override
                public void onResponse(Response<Types> response, Retrofit retrofit) {
                    if (response.isSuccess()) {
                        Types types = response.body();

                        ContentValues[] bulkToInsert;
                        List<ContentValues> tValueList = new ArrayList<>();

                        TypoxiiiContentValues values = new TypoxiiiContentValues();

                        values.putIypo(types.getName());

                        tValueList.add(values.values());

                        bulkToInsert = new ContentValues[tValueList.size()];
                        tValueList.toArray(bulkToInsert);
                        context.getContentResolver().bulkInsert(TypoxiiiColumns.CONTENT_URI, bulkToInsert);
                    }
                }

                @Override
                public void onFailure(Throwable t) {
                    Log.w(null, Arrays.toString(t.getStackTrace()));
                }
            });
        }
    }


    interface InterficiePokeApi
    {
        @GET("pokemon/{id}/")
        Call<Pokemon> pokemons(
                @Path("id") String id
        );
        @GET("type/{id}/")
        Call<Types> type(
                @Path("id") String id
        );

    }
}


