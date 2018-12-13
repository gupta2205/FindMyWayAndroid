
package com.example.mgupta.findmywayandroid;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlightInfoStatusResult implements Serializable
{

    @SerializedName("next_offset")
    @Expose
    private Integer nextOffset;
    @SerializedName("flights")
    @Expose
    private List<Flight> flights = null;
    private final static long serialVersionUID = -1721780441528040338L;

    public Integer getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

}
