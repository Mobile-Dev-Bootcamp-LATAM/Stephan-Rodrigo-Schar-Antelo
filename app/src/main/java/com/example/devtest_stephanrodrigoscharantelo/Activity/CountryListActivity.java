package com.example.devtest_stephanrodrigoscharantelo.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.devtest_stephanrodrigoscharantelo.Adapter.CountryAdapter;
import com.example.devtest_stephanrodrigoscharantelo.Json.CountryJson;
import com.example.devtest_stephanrodrigoscharantelo.R;
import com.example.devtest_stephanrodrigoscharantelo.Retrofit.Client;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CountryListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    //private CountryJson coutries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);
        Start();
    }

    private void Start(){
       recyclerView = findViewById(R.id.rv_countries);
       recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
       LoadCountryList();
    }

    private void LoadCountryList(){
        Call<List<CountryJson>> call = Client.getInstance().getApiService().getCountrylist();//Client.getApiService().getCountrylist();
        call.enqueue(new Callback<List<CountryJson>>() {
            @Override
            public void onResponse(Call<List<CountryJson>> call, Response<List<CountryJson>> response) {
                List<CountryJson> countries = response.body();
                CountryAdapter countryAdapter = new CountryAdapter(countries, getApplicationContext());
                recyclerView.setAdapter(countryAdapter);
                //countryAdapter.notifyDataSetChanged();
                //Log.d("entro", countries.toString());
                //System.err.println(countries);
                //Toast.makeText(getApplicationContext(), "Cargo", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<List<CountryJson>> call, Throwable t) {
                System.err.println(t);
                t.printStackTrace();
                Toast.makeText(getApplicationContext(), "Ocurrio un error en la conexion", Toast.LENGTH_LONG).show();
            }
        });
    }
}