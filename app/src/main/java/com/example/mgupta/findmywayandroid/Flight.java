
package com.example.mgupta.findmywayandroid;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Flight implements Serializable
{

    @SerializedName("ident")
    @Expose
    private String ident;
    @SerializedName("faFlightID")
    @Expose
    private String faFlightID;
    @SerializedName("airline")
    @Expose
    private String airline;
    @SerializedName("airline_iata")
    @Expose
    private String airlineIata;
    @SerializedName("flightnumber")
    @Expose
    private String flightnumber;
    @SerializedName("tailnumber")
    @Expose
    private String tailnumber;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("codeshares")
    @Expose
    private String codeshares;
    @SerializedName("blocked")
    @Expose
    private Boolean blocked;
    @SerializedName("diverted")
    @Expose
    private Boolean diverted;
    @SerializedName("cancelled")
    @Expose
    private Boolean cancelled;
    @SerializedName("origin")
    @Expose
    private Origin origin;
    @SerializedName("destination")
    @Expose
    private Destination destination;
    @SerializedName("filed_ete")
    @Expose
    private Integer filedEte;
    @SerializedName("filed_airspeed_kts")
    @Expose
    private Integer filedAirspeedKts;
    @SerializedName("distance_filed")
    @Expose
    private Integer distanceFiled;
    @SerializedName("filed_departure_time")
    @Expose
    private FiledDepartureTime filedDepartureTime;
    @SerializedName("estimated_departure_time")
    @Expose
    private EstimatedDepartureTime estimatedDepartureTime;
    @SerializedName("actual_departure_time")
    @Expose
    private ActualDepartureTime actualDepartureTime;
    @SerializedName("departure_delay")
    @Expose
    private Integer departureDelay;
    @SerializedName("filed_arrival_time")
    @Expose
    private FiledArrivalTime filedArrivalTime;
    @SerializedName("estimated_arrival_time")
    @Expose
    private EstimatedArrivalTime estimatedArrivalTime;
    @SerializedName("actual_arrival_time")
    @Expose
    private ActualArrivalTime actualArrivalTime;
    @SerializedName("arrival_delay")
    @Expose
    private Integer arrivalDelay;
    @SerializedName("filed_blockout_time")
    @Expose
    private FiledBlockoutTime filedBlockoutTime;
    @SerializedName("estimated_blockout_time")
    @Expose
    private EstimatedBlockoutTime estimatedBlockoutTime;
    @SerializedName("actual_blockout_time")
    @Expose
    private ActualBlockoutTime actualBlockoutTime;
    @SerializedName("filed_blockin_time")
    @Expose
    private FiledBlockinTime filedBlockinTime;
    @SerializedName("estimated_blockin_time")
    @Expose
    private EstimatedBlockinTime estimatedBlockinTime;
    @SerializedName("actual_blockin_time")
    @Expose
    private ActualBlockinTime actualBlockinTime;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("progress_percent")
    @Expose
    private Integer progressPercent;
    @SerializedName("aircrafttype")
    @Expose
    private String aircrafttype;
    @SerializedName("full_aircrafttype")
    @Expose
    private String fullAircrafttype;
    @SerializedName("terminal_dest")
    @Expose
    private String terminalDest;
    @SerializedName("gate_dest")
    @Expose
    private String gateDest;
    @SerializedName("gate_orig")
    @Expose
    private String gateOrig;
    @SerializedName("bag_claim")
    @Expose
    private String bagClaim;
    @SerializedName("seats_cabin_first")
    @Expose
    private Integer seatsCabinFirst;
    @SerializedName("seats_cabin_business")
    @Expose
    private Integer seatsCabinBusiness;
    @SerializedName("seats_cabin_coach")
    @Expose
    private Integer seatsCabinCoach;
    @SerializedName("inbound_faFlightID")
    @Expose
    private String inboundFaFlightID;
    @SerializedName("adhoc")
    @Expose
    private Boolean adhoc;
    private final static long serialVersionUID = 153198357383616L;

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getFaFlightID() {
        return faFlightID;
    }

    public void setFaFlightID(String faFlightID) {
        this.faFlightID = faFlightID;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getAirlineIata() {
        return airlineIata;
    }

    public void setAirlineIata(String airlineIata) {
        this.airlineIata = airlineIata;
    }

    public String getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(String flightnumber) {
        this.flightnumber = flightnumber;
    }

    public String getTailnumber() {
        return tailnumber;
    }

    public void setTailnumber(String tailnumber) {
        this.tailnumber = tailnumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCodeshares() {
        return codeshares;
    }

    public void setCodeshares(String codeshares) {
        this.codeshares = codeshares;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public Boolean getDiverted() {
        return diverted;
    }

    public void setDiverted(Boolean diverted) {
        this.diverted = diverted;
    }

    public Boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Integer getFiledEte() {
        return filedEte;
    }

    public void setFiledEte(Integer filedEte) {
        this.filedEte = filedEte;
    }

    public Integer getFiledAirspeedKts() {
        return filedAirspeedKts;
    }

    public void setFiledAirspeedKts(Integer filedAirspeedKts) {
        this.filedAirspeedKts = filedAirspeedKts;
    }

    public Integer getDistanceFiled() {
        return distanceFiled;
    }

    public void setDistanceFiled(Integer distanceFiled) {
        this.distanceFiled = distanceFiled;
    }

    public FiledDepartureTime getFiledDepartureTime() {
        return filedDepartureTime;
    }

    public void setFiledDepartureTime(FiledDepartureTime filedDepartureTime) {
        this.filedDepartureTime = filedDepartureTime;
    }

    public EstimatedDepartureTime getEstimatedDepartureTime() {
        return estimatedDepartureTime;
    }

    public void setEstimatedDepartureTime(EstimatedDepartureTime estimatedDepartureTime) {
        this.estimatedDepartureTime = estimatedDepartureTime;
    }

    public ActualDepartureTime getActualDepartureTime() {
        return actualDepartureTime;
    }

    public void setActualDepartureTime(ActualDepartureTime actualDepartureTime) {
        this.actualDepartureTime = actualDepartureTime;
    }

    public Integer getDepartureDelay() {
        return departureDelay;
    }

    public void setDepartureDelay(Integer departureDelay) {
        this.departureDelay = departureDelay;
    }

    public FiledArrivalTime getFiledArrivalTime() {
        return filedArrivalTime;
    }

    public void setFiledArrivalTime(FiledArrivalTime filedArrivalTime) {
        this.filedArrivalTime = filedArrivalTime;
    }

    public EstimatedArrivalTime getEstimatedArrivalTime() {
        return estimatedArrivalTime;
    }

    public void setEstimatedArrivalTime(EstimatedArrivalTime estimatedArrivalTime) {
        this.estimatedArrivalTime = estimatedArrivalTime;
    }

    public ActualArrivalTime getActualArrivalTime() {
        return actualArrivalTime;
    }

    public void setActualArrivalTime(ActualArrivalTime actualArrivalTime) {
        this.actualArrivalTime = actualArrivalTime;
    }

    public Integer getArrivalDelay() {
        return arrivalDelay;
    }

    public void setArrivalDelay(Integer arrivalDelay) {
        this.arrivalDelay = arrivalDelay;
    }

    public FiledBlockoutTime getFiledBlockoutTime() {
        return filedBlockoutTime;
    }

    public void setFiledBlockoutTime(FiledBlockoutTime filedBlockoutTime) {
        this.filedBlockoutTime = filedBlockoutTime;
    }

    public EstimatedBlockoutTime getEstimatedBlockoutTime() {
        return estimatedBlockoutTime;
    }

    public void setEstimatedBlockoutTime(EstimatedBlockoutTime estimatedBlockoutTime) {
        this.estimatedBlockoutTime = estimatedBlockoutTime;
    }

    public ActualBlockoutTime getActualBlockoutTime() {
        return actualBlockoutTime;
    }

    public void setActualBlockoutTime(ActualBlockoutTime actualBlockoutTime) {
        this.actualBlockoutTime = actualBlockoutTime;
    }

    public FiledBlockinTime getFiledBlockinTime() {
        return filedBlockinTime;
    }

    public void setFiledBlockinTime(FiledBlockinTime filedBlockinTime) {
        this.filedBlockinTime = filedBlockinTime;
    }

    public EstimatedBlockinTime getEstimatedBlockinTime() {
        return estimatedBlockinTime;
    }

    public void setEstimatedBlockinTime(EstimatedBlockinTime estimatedBlockinTime) {
        this.estimatedBlockinTime = estimatedBlockinTime;
    }

    public ActualBlockinTime getActualBlockinTime() {
        return actualBlockinTime;
    }

    public void setActualBlockinTime(ActualBlockinTime actualBlockinTime) {
        this.actualBlockinTime = actualBlockinTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getProgressPercent() {
        return progressPercent;
    }

    public void setProgressPercent(Integer progressPercent) {
        this.progressPercent = progressPercent;
    }

    public String getAircrafttype() {
        return aircrafttype;
    }

    public void setAircrafttype(String aircrafttype) {
        this.aircrafttype = aircrafttype;
    }

    public String getFullAircrafttype() {
        return fullAircrafttype;
    }

    public void setFullAircrafttype(String fullAircrafttype) {
        this.fullAircrafttype = fullAircrafttype;
    }

    public String getTerminalDest() {
        return terminalDest;
    }

    public void setTerminalDest(String terminalDest) {
        this.terminalDest = terminalDest;
    }

    public String getGateDest() {
        return gateDest;
    }

    public void setGateDest(String gateDest) {
        this.gateDest = gateDest;
    }

    public String getGateOrig() {
        return gateOrig;
    }

    public void setGateOrig(String gateOrig) {
        this.gateOrig = gateOrig;
    }

    public String getBagClaim() {
        return bagClaim;
    }

    public void setBagClaim(String bagClaim) {
        this.bagClaim = bagClaim;
    }

    public Integer getSeatsCabinFirst() {
        return seatsCabinFirst;
    }

    public void setSeatsCabinFirst(Integer seatsCabinFirst) {
        this.seatsCabinFirst = seatsCabinFirst;
    }

    public Integer getSeatsCabinBusiness() {
        return seatsCabinBusiness;
    }

    public void setSeatsCabinBusiness(Integer seatsCabinBusiness) {
        this.seatsCabinBusiness = seatsCabinBusiness;
    }

    public Integer getSeatsCabinCoach() {
        return seatsCabinCoach;
    }

    public void setSeatsCabinCoach(Integer seatsCabinCoach) {
        this.seatsCabinCoach = seatsCabinCoach;
    }

    public String getInboundFaFlightID() {
        return inboundFaFlightID;
    }

    public void setInboundFaFlightID(String inboundFaFlightID) {
        this.inboundFaFlightID = inboundFaFlightID;
    }

    public Boolean getAdhoc() {
        return adhoc;
    }

    public void setAdhoc(Boolean adhoc) {
        this.adhoc = adhoc;
    }

}
