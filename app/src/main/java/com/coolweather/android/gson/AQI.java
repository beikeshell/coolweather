package com.coolweather.android.gson;

/**
 * Created by beikeshell on 2017/12/21.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
