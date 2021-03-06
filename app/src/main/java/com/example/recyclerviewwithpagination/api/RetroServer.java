package com.example.recyclerviewwithpagination.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.recyclerviewwithpagination.BuildConfig.BASE_URL;

public class RetroServer {

    private static Retrofit retrofit = null;
    public static ApiRequestData getRetrofitServer() {
        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiRequestData.class);

    }
}
