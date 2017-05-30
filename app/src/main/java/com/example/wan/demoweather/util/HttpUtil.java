package com.example.wan.demoweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Wan on 2017/5/29.
 */

public class HttpUtil {

    public static void sendOkhttpRequest(String address,okhttp3.Callback callback){

        OkHttpClient client = new OkHttpClient();

        //在build()方法之前可以任意添加方法，ex:.add("username","admin");
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
        //在此方法内没有编写Response,在调用此方法的时候重写一个回调方法即可
    }

}
