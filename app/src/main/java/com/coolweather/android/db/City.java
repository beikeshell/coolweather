package com.coolweather.android.db;

import android.provider.ContactsContract;

import org.litepal.crud.DataSupport;

/**
 * Created by beikeshell on 2017/12/21.
 */

public class City extends DataSupport{
    private int mId;
    private String mCityName;
    private int mCityCode;
    private int mProvinceId;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getCityName() {
        return mCityName;
    }

    public void setCityName(String name) {
        mCityName = name;
    }

    public int getCityCode() {
        return mCityCode;
    }

    public void setCityCode(int code) {
        mCityCode = code;
    }

    public int getProvinceId() {
        return mProvinceId;
    }

    public void setProvinceId(int id) {
        mProvinceId = id;
    }
}
