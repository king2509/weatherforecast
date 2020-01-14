package com.test.weatherforcast.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HeWeather6 {
    public String status;

    public Basic basic;

    public Now now;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

    public Update update;

    @SerializedName("lifestyle")
    public List<Lifestyle> lifestyleList;
}
