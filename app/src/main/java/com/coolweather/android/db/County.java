package com.coolweather.android.db;

/**
 * Created by beikeshell on 2017/12/21.
 */

public class County {
    private int mId;
    private String mCountyName;
    private String mWeatherId;
    private int mCityId;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getCountyName() {
        return mCountyName;
    }

    public void setCountyName(String name) {
        mCountyName = name;
    }

    public String getmWeatherId() {
        return mWeatherId;
    }

    public void setWeatherId(String id) {
        mWeatherId = id;
    }

    public int getCityId() {
        return mCityId;
    }

    public void setCityId(int id) {
        mCityId = id;
    }

}
