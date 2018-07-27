package com.jorgereina.daggerpractice;

import com.jorgereina.daggerpractice.model.DogResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DogApi {
    //https://dog.ceo/api/breeds/list/all

    @GET("api/breeds/list/all")
    Call<DogResponse> getDogs();
}
