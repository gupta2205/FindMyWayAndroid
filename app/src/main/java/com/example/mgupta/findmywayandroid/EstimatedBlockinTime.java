
package com.example.mgupta.findmywayandroid;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EstimatedBlockinTime implements Serializable
{

    @SerializedName("epoch")
    @Expose
    private Integer epoch;
    @SerializedName("tz")
    @Expose
    private String tz;
    @SerializedName("dow")
    @Expose
    private String dow;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("localtime")
    @Expose
    private Integer localtime;
    private final static long serialVersionUID = 138903707709118301L;

    public Integer getEpoch() {
        return epoch;
    }

    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public String getDow() {
        return dow;
    }

    public void setDow(String dow) {
        this.dow = dow;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getLocaltime() {
        return localtime;
    }

    public void setLocaltime(Integer localtime) {
        this.localtime = localtime;
    }

}
