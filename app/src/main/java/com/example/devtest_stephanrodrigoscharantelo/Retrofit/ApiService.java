package com.example.devtest_stephanrodrigoscharantelo.Retrofit;

import com.example.devtest_stephanrodrigoscharantelo.Json.CountryJson;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("lang/es")
    Call<List<CountryJson>> getCountrylist();
}
