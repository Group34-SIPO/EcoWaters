package br.com.fiap.produtomvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;

public class Navio {
    @Id
    @JsonProperty("SHIP_ID")
    private String shipId;

    @JsonProperty("VESSEL_NAME")
    private String vesselName;

    @JsonProperty("TIMESTAMP")
    private String timestamp;

    @JsonProperty("SPEED")
    private double speed;

    @JsonProperty("COURSE")
    private double course;

    @JsonProperty("LAT")
    private double lat;

    @JsonProperty("LON")
    private double lon;

    @JsonProperty("DESTINATION")
    private String destination;

    public Navio() {
    }

    public Navio(String shipId, String vesselName, String timestamp, double speed, double course, double lat, double lon) {
        this.shipId = shipId;
        this.vesselName = vesselName;
        this.timestamp = timestamp;
        this.speed = speed;
        this.course = course;
        this.lat = lat;
        this.lon = lon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Navio navio = (Navio) o;
        return Double.compare(speed, navio.speed) == 0 && Double.compare(course, navio.course) == 0 && Double.compare(lat, navio.lat) == 0 && Double.compare(lon, navio.lon) == 0 && Objects.equals(shipId, navio.shipId) && Objects.equals(vesselName, navio.vesselName) && Objects.equals(timestamp, navio.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipId, vesselName, timestamp, speed, course, lat, lon);
    }

    public String getShipId() {
        return shipId;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
