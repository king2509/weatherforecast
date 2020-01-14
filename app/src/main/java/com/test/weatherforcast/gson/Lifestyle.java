package com.test.weatherforcast.gson;

import com.google.gson.annotations.SerializedName;

public class Lifestyle{
    @SerializedName("type")
    public String Comfort;

    @SerializedName("brf")
    public String brief;

    @SerializedName("txt")
    public String suggestion;
}
