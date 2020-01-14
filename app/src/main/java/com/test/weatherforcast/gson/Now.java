package com.test.weatherforcast.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("cond_code")
    public int weatherCondCode;

    @SerializedName("cond_txt")
    public String weatherCond;

    @SerializedName("tmp")
    public String nowTemperature;

    @SerializedName("wind_dir")
    public String windDirection;

    @SerializedName("wind_sc")
    public String windLevel;

    @SerializedName("wind_spd")
    public String windSpeed;
}
