
package com.example.mgupta.findmywayandroid;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightDetails implements Serializable
{

    @SerializedName("FlightInfoStatusResult")
    @Expose
    private FlightInfoStatusResult flightInfoStatusResult;
    private final static long serialVersionUID = 1308991721827850466L;

    public FlightInfoStatusResult getFlightInfoStatusResult() {
        return flightInfoStatusResult;
    }

    public void setFlightInfoStatusResult(FlightInfoStatusResult flightInfoStatusResult) {
        this.flightInfoStatusResult = flightInfoStatusResult;
    }

}
