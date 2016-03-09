package com.swacorp.mx.sf.integration.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MarketingFlights")
public class MarketingFlights {
	private String marketingCarrier;
	private String marketingFlightNumber;
		
	public String getMarketingCarrier() {
		return marketingCarrier;
	}
	@XmlAttribute(name="MarketingCarrier")
	public void setMarketingCarrier(String marketingCarrier) {
		this.marketingCarrier = marketingCarrier;
	}
	public String getMarketingFlightNumber() {
		return marketingFlightNumber;
	}
	@XmlAttribute(name="MarketingFlightNumber")
	public void setMarketingFlightNumber(String marketingFlightNumber) {
		this.marketingFlightNumber = marketingFlightNumber;
	}
	@Override
	public String toString() {
		return "MarketingFlights [marketingCarrier=" + marketingCarrier + ", marketingFlightNumber="
				+ marketingFlightNumber + "]";
	}
	
	
	
	
}
