package com.example.wan.demoweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Wan on 2017/5/31.
 */

public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
