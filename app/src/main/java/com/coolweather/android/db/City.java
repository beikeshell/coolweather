package com.coolweather.android.db;

import android.provider.ContactsContract;

import org.litepal.crud.DataSupport;

/**
 * Created by beikeshell on 2017/12/21.
 */

public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String name) {
        cityName = name;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int code) {
        cityCode = code;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int id) {
        provinceId = id;
    }
}
