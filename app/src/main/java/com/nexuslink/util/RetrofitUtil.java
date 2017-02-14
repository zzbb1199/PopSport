package com.nexuslink.util;

import com.elvishew.xlog.XLog;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ASUS-NB on 2017/1/15.
 */

public class RetrofitUtil {
    private static Retrofit mInstance;
    private static Retrofit mWeatherInstance;


    public static Retrofit getRetrofitInstance(String baseUrl){
        if(mInstance==null){
            mInstance = new Retrofit.Builder().baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }
        mInstance = new Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        XLog.e(mInstance);
        return mInstance;
    }
    public static Retrofit getRetrofitInstanceFroWeather(String baseUrl){
        if(mWeatherInstance==null){
            mWeatherInstance = new Retrofit.Builder().baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }
        return mWeatherInstance;
    }
}
