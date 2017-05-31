package com.example.wan.demoweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Wan on 2017/5/30.
 */

public class Basic {

    //使用@SerializedName注解的方式来让JSON字段和Java字段之间建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
