package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by beikeshell on 2017/12/21.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String name) {
        provinceName = name;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int code) {
        provinceCode = code;
    }
}
