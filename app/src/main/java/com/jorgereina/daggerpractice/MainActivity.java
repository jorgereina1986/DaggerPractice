package com.jorgereina.daggerpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.jorgereina.daggerpractice.model.DogResponse;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Inject
    DogApi dogApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((DIApp)getApplication()).getAppComponent().inject(this);


        
        Call<DogResponse> dogResponseCall = dogApi.getDogs();
        
        dogResponseCall.enqueue(new Callback<DogResponse>() {
            @Override
            public void onResponse(Call<DogResponse> call, Response<DogResponse> response) {
                Timber.d(response.code()+"");
            }

            @Override
            public void onFailure(Call<DogResponse> call, Throwable t) {

            }
        });
    }
}
