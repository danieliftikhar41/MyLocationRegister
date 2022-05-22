package com.example.mylocationregister.Config;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DefaultConstants {


    public static final   String BASE_URL = "https://127.0.0.1:8080/";

    public static final Retrofit retrofit = new Retrofit.Builder()
                            .baseUrl("https://localhost:8080/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();

}
