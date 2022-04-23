package com.example.devtest_stephanrodrigoscharantelo.Json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CountryJson {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("alpha2Code")
    @Expose
    private String alpha2Code;
    @SerializedName("alpha3Code")
    @Expose
    private String alpha3Code;
    @SerializedName("capital")
    @Expose
    private String capital;
    @SerializedName("subregion")
    @Expose
    private String subregion;
    @SerializedName("population")
    @Expose
    private Integer population;
    @SerializedName("area")
    @Expose
    private Double area;
    @SerializedName("languages")
    @Expose
    private List<LanguagesJson> languages;
    @SerializedName("currencies")
    @Expose
    private List<CurrenciesJson> currencies;
    @SerializedName("latlng")
    @Expose
    private List<Double> latlng;

    @SerializedName("flags")
    @Expose
    private FlagsJson flags;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public List<LanguagesJson> getLanguages() {
        return languages;
    }

    public void setLanguages(List<LanguagesJson> languages) {
        this.languages = languages;
    }

    public List<CurrenciesJson> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<CurrenciesJson> currencies) {
        this.currencies = currencies;
    }

    public List<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public FlagsJson getFlags() {
        return flags;
    }
}
