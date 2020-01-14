package com.test.weatherforcast.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;

    @SerializedName("cond_code_d")
    public int weatherCondCode_d;

    @SerializedName("cond_txt_d")
    public String weatherCond_d;

    @SerializedName("cond_code_n")
    public int weatherCondCode_n;

    @SerializedName("cond_txt_n")
    public String weatherCond_n;

    @SerializedName("tmp_min")
    public String minTemperature;

    @SerializedName("tmp_max")
    public String maxTemperature;
}
