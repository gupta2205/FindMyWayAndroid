
package com.example.mgupta.findmywayandroid;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ActualBlockoutTime implements Serializable
{

    @SerializedName("epoch")
    @Expose
    private Integer epoch;
    private final static long serialVersionUID = -7955014872552186566L;

    public Integer getEpoch() {
        return epoch;
    }

    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }

}
