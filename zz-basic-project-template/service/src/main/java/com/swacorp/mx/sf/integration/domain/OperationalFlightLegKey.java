package com.swacorp.mx.sf.integration.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="OperationalFlightLegKey")
public class OperationalFlightLegKey {
	private String operatingCarrier;
	private String scheduledFlightNumber;
	private String flightLegInstanceNumber;
	private String scheduleDate;
	private String scheduledDepartureDatetime;
	private String scheduledArrivalDatetime;
	private String scheduledDepartureStationCode;
	private String scheduledArrivalStationCode;
	private String arrivalStationCode;
	private String scheduledDepartureStationTimeZone;
	private String scheduledArrivalStationTimeZone;
	private String arrivalStationTimeZone;
	private String flightTypeCode;
	private String flightStateCode;
	private String forSale;
	private String tailNumber;
	private String noseNumber;
	private String equipmentTypeCode;
	private String capacity;
	private String schdDepCentralTzOffset;
	private String schdDepStnTzOffset;
	private String schdArrCentralTzOffset;
	private String schdArrStnTzOffset;
	private String wifiEquipt;
	private String scheduledMissionType;
	private String actualMissionType;
	private String operationType;
	private String scheduledEquipmentTypeCode; 
	private String scheduledACV; 
	private String aCV;
	private MarketingFlights marketingFlights;
	
	public String getOperatingCarrier() {
		return operatingCarrier;
	}
	@XmlAttribute(name="OperatingCarrier")
	public void setOperatingCarrier(String operatingCarrier) {
		this.operatingCarrier = operatingCarrier;
	}
	public String getScheduledFlightNumber() {
		return scheduledFlightNumber;
	}
	@XmlAttribute(name="ScheduledFlightNumber")
	public void setScheduledFlightNumber(String scheduledFlightNumber) {
		this.scheduledFlightNumber = scheduledFlightNumber;
	}
	public String getFlightLegInstanceNumber() {
		return flightLegInstanceNumber;
	}
	@XmlAttribute(name="FlightLegInstanceNumber")
	public void setFlightLegInstanceNumber(String flightLegInstanceNumber) {
		this.flightLegInstanceNumber = flightLegInstanceNumber;
	}
	public String getScheduleDate() {
		return scheduleDate;
	}
	@XmlAttribute(name="ScheduleDate")
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public String getScheduledDepartureDatetime() {
		return scheduledDepartureDatetime;
	}
	@XmlAttribute(name="ScheduledDepartureDatetime")
	public void setScheduledDepartureDatetime(String scheduledDepartureDatetime) {
		this.scheduledDepartureDatetime = scheduledDepartureDatetime;
	}
	public String getScheduledArrivalDatetime() {
		return scheduledArrivalDatetime;
	}
	@XmlAttribute(name="ScheduledArrivalDatetime")
	public void setScheduledArrivalDatetime(String scheduledArrivalDatetime) {
		this.scheduledArrivalDatetime = scheduledArrivalDatetime;
	}
	public String getScheduledDepartureStationCode() {
		return scheduledDepartureStationCode;
	}
	@XmlAttribute(name="ScheduledDepartureStationCode")
	public void setScheduledDepartureStationCode(String scheduledDepartureStationCode) {
		this.scheduledDepartureStationCode = scheduledDepartureStationCode;
	}
	public String getScheduledArrivalStationCode() {
		return scheduledArrivalStationCode;
	}
	@XmlAttribute(name="ScheduledArrivalStationCode")
	public void setScheduledArrivalStationCode(String scheduledArrivalStationCode) {
		this.scheduledArrivalStationCode = scheduledArrivalStationCode;
	}
	public String getArrivalStationCode() {
		return arrivalStationCode;
	}
	@XmlAttribute(name="ArrivalStationCode")
	public void setArrivalStationCode(String arrivalStationCode) {
		this.arrivalStationCode = arrivalStationCode;
	}
	public String getScheduledDepartureStationTimeZone() {
		return scheduledDepartureStationTimeZone;
	}
	@XmlAttribute(name="ScheduledDepartureStationTimeZone")
	public void setScheduledDepartureStationTimeZone(String scheduledDepartureStationTimeZone) {
		this.scheduledDepartureStationTimeZone = scheduledDepartureStationTimeZone;
	}
	public String getScheduledArrivalStationTimeZone() {
		return scheduledArrivalStationTimeZone;
	}
	@XmlAttribute(name="ScheduledArrivalStationTimeZone")
	public void setScheduledArrivalStationTimeZone(String scheduledArrivalStationTimeZone) {
		this.scheduledArrivalStationTimeZone = scheduledArrivalStationTimeZone;
	}
	public String getArrivalStationTimeZone() {
		return arrivalStationTimeZone;
	}
	@XmlAttribute(name="ArrivalStationTimeZone")
	public void setArrivalStationTimeZone(String arrivalStationTimeZone) {
		this.arrivalStationTimeZone = arrivalStationTimeZone;
	}
	public String getFlightTypeCode() {
		return flightTypeCode;
	}
	@XmlAttribute(name="FlightTypeCode")
	public void setFlightTypeCode(String flightTypeCode) {
		this.flightTypeCode = flightTypeCode;
	}
	public String getFlightStateCode() {
		return flightStateCode;
	}
	@XmlAttribute(name="FlightStateCode")
	public void setFlightStateCode(String flightStateCode) {
		this.flightStateCode = flightStateCode;
	}
	public String getForSale() {
		return forSale;
	}
	@XmlAttribute(name="ForSale")
	public void setForSale(String forSale) {
		this.forSale = forSale;
	}
	public String getTailNumber() {
		return tailNumber;
	}
	@XmlAttribute(name="TailNumber")
	public void setTailNumber(String tailNumber) {
		this.tailNumber = tailNumber;
	}
	public String getNoseNumber() {
		return noseNumber;
	}
	@XmlAttribute(name="NoseNumber")
	public void setNoseNumber(String noseNumber) {
		this.noseNumber = noseNumber;
	}
	public String getEquipmentTypeCode() {
		return equipmentTypeCode;
	}
	@XmlAttribute(name="EquipmentTypeCode")
	public void setEquipmentTypeCode(String equipmentTypeCode) {
		this.equipmentTypeCode = equipmentTypeCode;
	}
	public String getCapacity() {
		return capacity;
	}
	@XmlAttribute(name="Capacity")
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getSchdDepCentralTzOffset() {
		return schdDepCentralTzOffset;
	}
	@XmlAttribute(name="SchdDepCentralTzOffset")
	public void setSchdDepCentralTzOffset(String schdDepCentralTzOffset) {
		this.schdDepCentralTzOffset = schdDepCentralTzOffset;
	}
	public String getSchdDepStnTzOffset() {
		return schdDepStnTzOffset;
	}
	@XmlAttribute(name="SchdDepStnTzOffset")
	public void setSchdDepStnTzOffset(String schdDepStnTzOffset) {
		this.schdDepStnTzOffset = schdDepStnTzOffset;
	}
	public String getSchdArrCentralTzOffset() {
		return schdArrCentralTzOffset;
	}
	@XmlAttribute(name="SchdArrCentralTzOffset")
	public void setSchdArrCentralTzOffset(String schdArrCentralTzOffset) {
		this.schdArrCentralTzOffset = schdArrCentralTzOffset;
	}
	public String getSchdArrStnTzOffset() {
		return schdArrStnTzOffset;
	}
	@XmlAttribute(name="SchdArrStnTzOffset")
	public void setSchdArrStnTzOffset(String schdArrStnTzOffset) {
		this.schdArrStnTzOffset = schdArrStnTzOffset;
	}
	public String getWifiEquipt() {
		return wifiEquipt;
	}
	@XmlAttribute(name="WifiEquipt")
	public void setWifiEquipt(String wifiEquipt) {
		this.wifiEquipt = wifiEquipt;
	}
	public String getScheduledMissionType() {
		return scheduledMissionType;
	}
	@XmlAttribute(name="ScheduledMissionType")
	public void setScheduledMissionType(String scheduledMissionType) {
		this.scheduledMissionType = scheduledMissionType;
	}
	public String getActualMissionType() {
		return actualMissionType;
	}
	@XmlAttribute(name="ActualMissionType")
	public void setActualMissionType(String actualMissionType) {
		this.actualMissionType = actualMissionType;
	}
	public String getOperationType() {
		return operationType;
	}
	@XmlAttribute(name="OperationType")
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public String getScheduledEquipmentTypeCode() {
		return scheduledEquipmentTypeCode;
	}
	@XmlAttribute(name="ScheduledEquipmentTypeCode")
	public void setScheduledEquipmentTypeCode(String scheduledEquipmentTypeCode) {
		this.scheduledEquipmentTypeCode = scheduledEquipmentTypeCode;
	}
	public String getScheduledACV() {
		return scheduledACV;
	}
	@XmlAttribute(name="ScheduledACV")
	public void setScheduledACV(String scheduledACV) {
		this.scheduledACV = scheduledACV;
	}
	public String getaCV() {
		return aCV;
	}
	@XmlAttribute(name="ACV")
	public void setaCV(String aCV) {
		this.aCV = aCV;
	}
	public MarketingFlights getMarketingFlights() {
		return marketingFlights;
	}
	@XmlElement(name="MarketingFlights")
	public void setMarketingFlights(MarketingFlights marketingFlights) {
		this.marketingFlights = marketingFlights;
	}
	@Override
	public String toString() {
		return "OperationalFlightLegKey [operatingCarrier=" + operatingCarrier + ", scheduledFlightNumber="
				+ scheduledFlightNumber + ", flightLegInstanceNumber=" + flightLegInstanceNumber + ", scheduleDate="
				+ scheduleDate + ", scheduledDepartureDatetime=" + scheduledDepartureDatetime
				+ ", scheduledArrivalDatetime=" + scheduledArrivalDatetime + ", scheduledDepartureStationCode="
				+ scheduledDepartureStationCode + ", scheduledArrivalStationCode=" + scheduledArrivalStationCode
				+ ", arrivalStationCode=" + arrivalStationCode + ", scheduledDepartureStationTimeZone="
				+ scheduledDepartureStationTimeZone + ", scheduledArrivalStationTimeZone="
				+ scheduledArrivalStationTimeZone + ", arrivalStationTimeZone=" + arrivalStationTimeZone
				+ ", flightTypeCode=" + flightTypeCode + ", flightStateCode=" + flightStateCode + ", forSale=" + forSale
				+ ", tailNumber=" + tailNumber + ", noseNumber=" + noseNumber + ", equipmentTypeCode="
				+ equipmentTypeCode + ", capacity=" + capacity + ", schdDepCentralTzOffset=" + schdDepCentralTzOffset
				+ ", schdDepStnTzOffset=" + schdDepStnTzOffset + ", schdArrCentralTzOffset=" + schdArrCentralTzOffset
				+ ", schdArrStnTzOffset=" + schdArrStnTzOffset + ", wifiEquipt=" + wifiEquipt
				+ ", scheduledMissionType=" + scheduledMissionType + ", actualMissionType=" + actualMissionType
				+ ", operationType=" + operationType + ", scheduledEquipmentTypeCode=" + scheduledEquipmentTypeCode
				+ ", scheduledACV=" + scheduledACV + ", aCV=" + aCV + ", marketingFlights=" + marketingFlights + "]";
	}
	
	
	
}
