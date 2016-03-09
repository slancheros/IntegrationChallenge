package com.swacorp.mx.sf.integration.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GateAssignment")
public class GateAssignment {
	
	
	private String arrivalGate;

	
	private ArrivalGateIdentifier arrivalGateIdentifier;
	
	
	private EventInfo eventInfo;
	
	private OperationalFlightLegKey operationalFlightLegKey;
	
	public String getArrivalGate() {
		return arrivalGate;
	}
	
	@XmlAttribute(name="ArrivalGate")
	public void setArrivalGate(String arrivalGate) {
		this.arrivalGate = arrivalGate;
	}

	
	public ArrivalGateIdentifier getArrivalGateIdentifier() {
		return arrivalGateIdentifier;
	}

	@XmlElement(name="ArrivalGateIdentifier")
	public void setArrivalGateIdentifier(ArrivalGateIdentifier arrivalGateIdentifier) {
		this.arrivalGateIdentifier = arrivalGateIdentifier;
	}

	
	public EventInfo getEventInfo() {
		return eventInfo;
	}
	
	
	@XmlElement(name="EventInfo")
	public void setEventInfo(EventInfo eventInfo) {
		this.eventInfo = eventInfo;
	}

	public OperationalFlightLegKey getOperationalFlightLegKey() {
		return operationalFlightLegKey;
	}

	@XmlElement(name="OperationalFlightLegKey")
	public void setOperationalFlightLegKey(OperationalFlightLegKey operationalFlightLegKey) {
		this.operationalFlightLegKey = operationalFlightLegKey;
	}

	@Override
	public String toString() {
		return "GateAssignment [arrivalGate=" + arrivalGate + ", arrivalGateIdentifier=" + arrivalGateIdentifier
				+ ", eventInfo=" + eventInfo + ", operationalFlightLegKey=" + operationalFlightLegKey + "]";
	}
	
	
	
	
	

	
	
	
	
}
