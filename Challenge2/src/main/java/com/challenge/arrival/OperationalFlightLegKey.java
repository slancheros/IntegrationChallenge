package com.challenge.arrival;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OperationalFlightLegKey")
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
	private String acv;
	private MarketingFlight marketingFlight;
	
	@XmlAttribute(name = "OperatingCarrier")
	public String getOperatingCarrier() {
		return operatingCarrier;
	}
	public void setOperatingCarrier(String operatingCarrier) {
		this.operatingCarrier = operatingCarrier;
	}
	@XmlAttribute(name = "ScheduledFlightNumber")
	public String getScheduledFlightNumber() {
		return scheduledFlightNumber;
	}
	public void setScheduledFlightNumber(String scheduledFlightNumber) {
		this.scheduledFlightNumber = scheduledFlightNumber;
	}
	@XmlAttribute(name = "FlightLegInstanceNumber")
	public String getFlightLegInstanceNumber() {
		return flightLegInstanceNumber;
	}
	public void setFlightLegInstanceNumber(String flightLegInstanceNumber) {
		this.flightLegInstanceNumber = flightLegInstanceNumber;
	}
	@XmlAttribute(name = "ScheduleDate")
	public String getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	@XmlAttribute(name = "ScheduledDepartureDatetime")
	public String getScheduledDepartureDatetime() {
		return scheduledDepartureDatetime;
	}
	public void setScheduledDepartureDatetime(String scheduledDepartureDatetime) {
		this.scheduledDepartureDatetime = scheduledDepartureDatetime;
	}
	@XmlAttribute(name = "ScheduledArrivalDatetime")
	public String getScheduledArrivalDatetime() {
		return scheduledArrivalDatetime;
	}
	public void setScheduledArrivalDatetime(String scheduledArrivalDatetime) {
		this.scheduledArrivalDatetime = scheduledArrivalDatetime;
	}
	@XmlAttribute(name = "ScheduledDepartureStationCode")
	public String getScheduledDepartureStationCode() {
		return scheduledDepartureStationCode;
	}
	public void setScheduledDepartureStationCode(String scheduledDepartureStationCode) {
		this.scheduledDepartureStationCode = scheduledDepartureStationCode;
	}
	@XmlAttribute(name = "ScheduledArrivalStationCode")
	public String getScheduledArrivalStationCode() {
		return scheduledArrivalStationCode;
	}
	public void setScheduledArrivalStationCode(String scheduledArrivalStationCode) {
		this.scheduledArrivalStationCode = scheduledArrivalStationCode;
	}
	@XmlAttribute(name = "ArrivalStationCode")
	public String getArrivalStationCode() {
		return arrivalStationCode;
	}
	public void setArrivalStationCode(String arrivalStationCode) {
		this.arrivalStationCode = arrivalStationCode;
	}
	@XmlAttribute(name = "ScheduledDepartureStationTimeZone")
	public String getScheduledDepartureStationTimeZone() {
		return scheduledDepartureStationTimeZone;
	}
	public void setScheduledDepartureStationTimeZone(String scheduledDepartureStationTimeZone) {
		this.scheduledDepartureStationTimeZone = scheduledDepartureStationTimeZone;
	}
	@XmlAttribute(name = "ScheduledArrivalStationTimeZone")
	public String getScheduledArrivalStationTimeZone() {
		return scheduledArrivalStationTimeZone;
	}
	public void setScheduledArrivalStationTimeZone(String scheduledArrivalStationTimeZone) {
		this.scheduledArrivalStationTimeZone = scheduledArrivalStationTimeZone;
	}
	@XmlAttribute(name = "ArrivalStationTimeZone")
	public String getArrivalStationTimeZone() {
		return arrivalStationTimeZone;
	}
	public void setArrivalStationTimeZone(String arrivalStationTimeZone) {
		this.arrivalStationTimeZone = arrivalStationTimeZone;
	}
	@XmlAttribute(name = "FlightTypeCode")
	public String getFlightTypeCode() {
		return flightTypeCode;
	}
	public void setFlightTypeCode(String flightTypeCode) {
		this.flightTypeCode = flightTypeCode;
	}
	@XmlAttribute(name = "FlightStateCode")
	public String getFlightStateCode() {
		return flightStateCode;
	}
	public void setFlightStateCode(String flightStateCode) {
		this.flightStateCode = flightStateCode;
	}
	@XmlAttribute(name = "ForSale")
	public String getForSale() {
		return forSale;
	}
	public void setForSale(String forSale) {
		this.forSale = forSale;
	}
	@XmlAttribute(name = "TailNumber")
	public String getTailNumber() {
		return tailNumber;
	}
	public void setTailNumber(String tailNumber) {
		this.tailNumber = tailNumber;
	}
	@XmlAttribute(name = "NoseNumber")
	public String getNoseNumber() {
		return noseNumber;
	}
	public void setNoseNumber(String noseNumber) {
		this.noseNumber = noseNumber;
	}
	@XmlAttribute(name = "EquipmentTypeCode")
	public String getEquipmentTypeCode() {
		return equipmentTypeCode;
	}
	public void setEquipmentTypeCode(String equipmentTypeCode) {
		this.equipmentTypeCode = equipmentTypeCode;
	}
	@XmlAttribute(name = "Capacity")
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	@XmlAttribute(name = "SchdDepCentralTzOffset")
	public String getSchdDepCentralTzOffset() {
		return schdDepCentralTzOffset;
	}
	public void setSchdDepCentralTzOffset(String schdDepCentralTzOffset) {
		this.schdDepCentralTzOffset = schdDepCentralTzOffset;
	}
	@XmlAttribute(name = "SchdDepStnTzOffset")
	public String getSchdDepStnTzOffset() {
		return schdDepStnTzOffset;
	}
	public void setSchdDepStnTzOffset(String schdDepStnTzOffset) {
		this.schdDepStnTzOffset = schdDepStnTzOffset;
	}
	@XmlAttribute(name = "SchdArrCentralTzOffset")
	public String getSchdArrCentralTzOffset() {
		return schdArrCentralTzOffset;
	}
	public void setSchdArrCentralTzOffset(String schdArrCentralTzOffset) {
		this.schdArrCentralTzOffset = schdArrCentralTzOffset;
	}
	@XmlAttribute(name = "SchdArrStnTzOffset")
	public String getSchdArrStnTzOffset() {
		return schdArrStnTzOffset;
	}
	public void setSchdArrStnTzOffset(String schdArrStnTzOffset) {
		this.schdArrStnTzOffset = schdArrStnTzOffset;
	}
	@XmlAttribute(name = "WifiEquipt")
	public String getWifiEquipt() {
		return wifiEquipt;
	}
	public void setWifiEquipt(String wifiEquipt) {
		this.wifiEquipt = wifiEquipt;
	}
	@XmlAttribute(name = "ScheduledMissionType")
	public String getScheduledMissionType() {
		return scheduledMissionType;
	}
	public void setScheduledMissionType(String scheduledMissionType) {
		this.scheduledMissionType = scheduledMissionType;
	}
	@XmlAttribute(name = "ActualMissionType")
	public String getActualMissionType() {
		return actualMissionType;
	}
	public void setActualMissionType(String actualMissionType) {
		this.actualMissionType = actualMissionType;
	}
	@XmlAttribute(name = "OperationType")
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	@XmlAttribute(name = "ScheduledEquipmentTypeCode")
	public String getScheduledEquipmentTypeCode() {
		return scheduledEquipmentTypeCode;
	}
	public void setScheduledEquipmentTypeCode(String scheduledEquipmentTypeCode) {
		this.scheduledEquipmentTypeCode = scheduledEquipmentTypeCode;
	}
	@XmlAttribute(name = "ScheduledACV")
	public String getScheduledACV() {
		return scheduledACV;
	}
	public void setScheduledACV(String scheduledACV) {
		this.scheduledACV = scheduledACV;
	}
	@XmlAttribute(name = "ACV")
	public String getAcv() {
		return acv;
	}
	public void setAcv(String acv) {
		this.acv = acv;
	}
	
	@XmlElement(name = "MarketingFlights")
	public MarketingFlight getMarketingFlight() {
		return marketingFlight;
	}
	public void setMarketingFlight(MarketingFlight marketingFlight) {
		this.marketingFlight = marketingFlight;
	}
	
	

}
