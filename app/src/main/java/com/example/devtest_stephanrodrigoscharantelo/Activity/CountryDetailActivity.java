package com.example.devtest_stephanrodrigoscharantelo.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.devtest_stephanrodrigoscharantelo.R;

public class CountryDetailActivity extends AppCompatActivity {

    private TextView tvname, tvcapital, tvpopulation, tvlanguage, tvarea, tvlat, tvlong, tvcurrency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_detail);
        Start();
    }

    private void Start(){
        tvname = findViewById(R.id.tv_detailname);
        tvcapital = findViewById(R.id.tv_detailcapital);
        tvpopulation = findViewById(R.id.tv_detailpopulation);
        tvlanguage = findViewById(R.id.tv_language);
        tvarea = findViewById(R.id.tv_area);
        tvlat = findViewById(R.id.tv_lat);
        tvlong = findViewById(R.id.tv_long);
        tvcurrency = findViewById(R.id.tv_currenci);

        tvname.setText(getIntent().getStringExtra("name"));
        tvcapital.setText("Capital " + getIntent().getStringExtra("capital"));
        tvpopulation.setText("Population " + getIntent().getStringExtra("population"));
        tvarea.setText("Area " + getIntent().getStringExtra("area") + " km2");
    }
}