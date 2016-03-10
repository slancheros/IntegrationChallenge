package com.challenge.arrival;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ArrivalGateIdentifier")
public class ArrivalGateIdentifier  {
	
	private String newGate;
	private String originalGate;

	@XmlAttribute(name = "NewGate")
	public String getNewGate() {
		return newGate;
	}
	
	public void setNewGate(String newGate) {
		this.newGate = newGate;
	}

	@XmlAttribute(name = "OriginalGate")
	public String getOriginalGate() {
		return originalGate;
	}

	public void setOriginalGate(String originalGate) {
		this.originalGate = originalGate;
	}
	

}
