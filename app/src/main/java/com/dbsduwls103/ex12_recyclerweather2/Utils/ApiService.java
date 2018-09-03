package com.dbsduwls103.ex12_recyclerweather2.Utils;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    static final String BASEURL = "https://api.openweathermap.org/data/2.5/";
    static final String APPID = "b6c43c45171a007ce07fdfb1c378ff5a";
    static final String UNIT = "metric";
    @GET("forecast")
    Call<JsonObject> getWeeklyWeather(
            @Query("appid") String appid,
            @Query("lat") double lat,
            @Query("lon") double lon,
            @Query("units") String units
    );
}
