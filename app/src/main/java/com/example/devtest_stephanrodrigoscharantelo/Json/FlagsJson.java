package com.example.devtest_stephanrodrigoscharantelo.Json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FlagsJson {
    @SerializedName("svg")
    @Expose
    private String svg;
    @SerializedName("png")
    @Expose
    private String png;

    public String getSvg() {
        return svg;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }

    public String getPng() {
        return png;
    }

    public void setPng(String png) {
        this.png = png;
    }
}
