package com.example.mylocationregister.Config;

import com.example.mylocationregister.Models.Request;
import com.example.mylocationregister.Models.apiResponse;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ApiCall {



    
    //name//latitud//longitud//
   @POST("?")
   Call<apiResponse> getData(@Body Request Request);

}
