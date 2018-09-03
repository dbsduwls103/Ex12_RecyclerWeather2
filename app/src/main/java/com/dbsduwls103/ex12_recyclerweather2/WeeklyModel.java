package com.dbsduwls103.ex12_recyclerweather2;

public class WeeklyModel {
    private String icon;
    private String temp;
    private String tempMin;
    private String tempMax;
    private String date;
    private String detail;
    private String summary;

    public WeeklyModel(String icon, String temp, String tempMin, String tempMax, String date, String detail, String summary) {
        this.icon = icon;
        this.temp = temp;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.date = date;
        this.detail = detail;
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public String getTemp() {
        return temp;
    }

    public String getTempMin() {
        return tempMin;
    }

    public String getTempMax() {
        return tempMax;
    }

    public String getDate() {
        return date;
    }

    public String getDetail() {
        return detail;
    }

    public String getSummary() {
        return summary;
    }
}
