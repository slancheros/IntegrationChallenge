package com.challenge.arrival;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GateAssignment")
public class GateAssignment {
	
	private EventInfo eventInfo;
	private OperationalFlightLegKey operationalFlightLegKey;
	private ArrivalGateIdentifier arrivalGateIdentifier;
	private String arrivalGate;
	
	
	public GateAssignment() {
		// TODO Auto-generated constructor stub
	}
	
	@XmlElement(name = "EventInfo")
	public EventInfo getEventInfo() {
		return eventInfo;
	}
	
	public void setEventInfo(EventInfo eventInfo) {
		this.eventInfo = eventInfo;
	}
	
	@XmlElement(name = "OperationalFlightLegKey")
	public OperationalFlightLegKey getOperationalFlightLegKey() {
		return operationalFlightLegKey;
	}
	public void setOperationalFlightLegKey(OperationalFlightLegKey operationalFlightLegKey) {
		this.operationalFlightLegKey = operationalFlightLegKey;
	}
	
	@XmlElement(name = "ArrivalGateIdentifier")
	public ArrivalGateIdentifier getArrivalGateIdentifier() {
		return arrivalGateIdentifier;
	}
	public void setArrivalGateIdentifier(ArrivalGateIdentifier arrivalGateIdentifier) {
		this.arrivalGateIdentifier = arrivalGateIdentifier;
	}

	@XmlAttribute(name = "ArrivalGate")
	public String getArrivalGate() {
		return arrivalGate;
	}

	public void setArrivalGate(String arrivalGate) {
		this.arrivalGate = arrivalGate;
	}
	
}
