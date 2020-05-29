package com.jadedev.taller_api;

public class CountryCovid {

    private String country;
    private String country_code;
    private int latest;
    private String province;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public int getLatest() {
        return latest;
    }

    public void setLatest(int latest) {
        this.latest = latest;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
