package com.example.devtest_stephanrodrigoscharantelo.Json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LanguagesJson {
    @SerializedName("iso639_1")
    @Expose
    private String iso639_1;
    @SerializedName("iso639_2")
    @Expose
    private String iso639_2;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("nativeName")
    @Expose
    private String nativeName;
}
