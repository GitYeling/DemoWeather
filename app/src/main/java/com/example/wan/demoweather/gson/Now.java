package com.example.wan.demoweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Wan on 2017/5/30.
 */

public class Now {

    @SerializedName("tmp")
    public String temprature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
