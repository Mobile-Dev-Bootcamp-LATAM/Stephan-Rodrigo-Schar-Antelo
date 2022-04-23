package com.example.devtest_stephanrodrigoscharantelo.Json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrenciesJson {
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("symbol")
    @Expose
    private String symbol;
}
