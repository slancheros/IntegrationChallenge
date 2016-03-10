package com.challenge.arrival;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MarketingFlights")
public class MarketingFlight {

	private String marketingCarrier;
	private String marketingFlightNumber;
	
	@XmlAttribute(name = "MarketingCarrier")
	public String getMarketingCarrier() {
		return marketingCarrier;
	}
	public void setMarketingCarrier(String marketingCarrier) {
		this.marketingCarrier = marketingCarrier;
	}
	@XmlAttribute(name = "MarketingFlightNumber")
	public String getMarketingFlightNumber() {
		return marketingFlightNumber;
	}
	public void setMarketingFlightNumber(String marketingFlightNumber) {
		this.marketingFlightNumber = marketingFlightNumber;
	}
	
}
