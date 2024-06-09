package br.com.fiap.produtomvc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;

public class Focos {
    @Id
    @JsonProperty("SHIP_ID")
    private String shipId;

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

    public Focos() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Focos focos = (Focos) o;
        return Double.compare(speed, focos.speed) == 0 && Double.compare(course, focos.course) == 0 && Double.compare(lat, focos.lat) == 0 && Double.compare(lon, focos.lon) == 0 && Objects.equals(shipId, focos.shipId) && Objects.equals(timestamp, focos.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipId, timestamp, speed, course, lat, lon);
    }

    public Focos(String shipId, String timestamp, double speed, double course, double lat, double lon) {
        this.shipId = shipId;
        this.timestamp = timestamp;
        this.speed = speed;
        this.course = course;
        this.lat = lat;
        this.lon = lon;
    }

    public String getShipId() {
        return shipId;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
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
