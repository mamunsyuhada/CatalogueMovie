package com.mamunsyuhada.cataloguemovie.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConfigRetrofit {
    private static Retrofit retrofit = null;

    private static Retrofit getRetrofit() {
        if (retrofit == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(ConsUrl.BASE_URL_DBMovie)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
