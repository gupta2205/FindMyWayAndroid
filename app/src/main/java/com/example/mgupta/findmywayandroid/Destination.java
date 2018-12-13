
package com.example.mgupta.findmywayandroid;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Destination implements Serializable
{

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("alternate_ident")
    @Expose
    private String alternateIdent;
    @SerializedName("airport_name")
    @Expose
    private String airportName;
    private final static long serialVersionUID = -2901134087545384066L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAlternateIdent() {
        return alternateIdent;
    }

    public void setAlternateIdent(String alternateIdent) {
        this.alternateIdent = alternateIdent;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

}
