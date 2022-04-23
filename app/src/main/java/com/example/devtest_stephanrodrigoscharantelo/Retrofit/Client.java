package com.example.devtest_stephanrodrigoscharantelo.Retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class Client {

    private static ApiService apiService;
    private static Client instance = null;

    private Client(){
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BaseUrl.baseUrl)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        apiService = retrofit.create(ApiService.class);
    }

    public static synchronized Client getInstance(){
        if (instance == null){
            instance = new Client();
        }
        return instance;
    }

    public ApiService getApiService() {
        return apiService;
    }
}
