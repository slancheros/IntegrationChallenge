package com.swacorp.mx.sf.integration.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ArrivalGateIdentifier")
public class ArrivalGateIdentifier {
	
	
	private String originalGate;

	private String newGate;
	
	public String getOriginalGate() {
		return originalGate;
	}
	
	@XmlAttribute(name="OriginalGate")
	public void setOriginalGate(String originalGate) {
		this.originalGate = originalGate;
	}

	public String getNewGate() {
		return newGate;
	}

	@XmlAttribute(name="NewGate")
	public void setNewGate(String newGate) {
		this.newGate = newGate;
	}

	@Override
	public String toString() {
		return "ArrivalGateIdentifier [originalGate=" + originalGate + ", newGate=" + newGate + "]";
	}

	
	
}
