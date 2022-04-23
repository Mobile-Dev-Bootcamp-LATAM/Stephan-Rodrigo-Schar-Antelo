package com.example.devtest_stephanrodrigoscharantelo.Retrofit;

public class BaseUrl {

    public static String baseUrlJs = "https://restcountries.com/v2/";

    public static  String baseUrl = baseUrlJs;

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static void setBaseUrl(String baseUrl) {
        BaseUrl.baseUrl = baseUrl;
    }
}
