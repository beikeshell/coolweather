package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by beikeshell on 2017/12/21.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String name) {
        countyName = name;
    }

    public String getmWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String id) {
        weatherId = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int id) {
        cityId = id;
    }

}
