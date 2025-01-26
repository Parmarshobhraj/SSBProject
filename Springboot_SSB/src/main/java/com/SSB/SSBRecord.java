package com.SSB;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ssb_records")

public class SSBRecord {
	    @Id
	    @Column(name = "event_id")
	    private String eventID;

	    private Timestamp datetime;
	    private Double latitude;
	    private Double longitude;
	    private Double magnitude;
	    private String magType;
	    private Double depth;
	    private Integer phaseCount;
	    private Double azimuthGap;
	    private String location;
	    private String agency;
	    private Double scalarMoment;
		public String getEventID() {
			return eventID;
		}
		public void setEventID(String eventID) {
			this.eventID = eventID;
		}
		public Timestamp getDatetime() {
			return datetime;
		}
		public void setDatetime(Timestamp datetime) {
			this.datetime = datetime;
		}
		public Double getLatitude() {
			return latitude;
		}
		public void setLatitude(Double latitude) {
			this.latitude = latitude;
		}
		public Double getLongitude() {
			return longitude;
		}
		public void setLongitude(Double longitude) {
			this.longitude = longitude;
		}
		public Double getMagnitude() {
			return magnitude;
		}
		public void setMagnitude(Double magnitude) {
			this.magnitude = magnitude;
		}
		public String getMagType() {
			return magType;
		}
		public void setMagType(String magType) {
			this.magType = magType;
		}
		public Double getDepth() {
			return depth;
		}
		public void setDepth(Double depth) {
			this.depth = depth;
		}
		public Integer getPhaseCount() {
			return phaseCount;
		}
		public void setPhaseCount(Integer phaseCount) {
			this.phaseCount = phaseCount;
		}
		public Double getAzimuthGap() {
			return azimuthGap;
		}
		public void setAzimuthGap(Double azimuthGap) {
			this.azimuthGap = azimuthGap;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getAgency() {
			return agency;
		}
		public void setAgency(String agency) {
			this.agency = agency;
		}
		public Double getScalarMoment() {
			return scalarMoment;
		}
		public void setScalarMoment(Double scalarMoment) {
			this.scalarMoment = scalarMoment;
		}
		@Override
		public String toString() {
			return "SSBRecord [eventID=" + eventID + ", datetime=" + datetime + ", latitude=" + latitude
					+ ", longitude=" + longitude + ", magnitude=" + magnitude + ", magType=" + magType + ", depth="
					+ depth + ", phaseCount=" + phaseCount + ", azimuthGap=" + azimuthGap + ", location=" + location
					+ ", agency=" + agency + ", scalarMoment=" + scalarMoment + "]";
		}

	    
	}


