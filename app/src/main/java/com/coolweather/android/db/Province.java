package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by beikeshell on 2017/12/21.
 */

public class Province extends DataSupport{
    private int mId;
    private String mProvinceName;
    private int mProvinceCode;
    public int getId() {
        return mId;
    }
    public void setId(int id) {
        this.mId = id;
    }

    public String getProvinceName() {
        return mProvinceName;
    }

    public void setProvinceName(String name) {
        mProvinceName = name;
    }

    public int getProvinceCode() {
        return mProvinceCode;
    }

    public void setProvinceCode(int code) {
        mProvinceCode = code;
    }
}
