package com.swacorp.mx.sf.integration;

import java.io.File;

import javax.xml.bind.UnmarshalException;

import org.junit.Test;

import com.swacorp.mx.sf.integration.domain.GateAssignment;
import com.swacorp.mx.sf.integration.utils.IntegrationLayerTransformationUtils;

import static org.junit.Assert.*;
public class ParseXmlFilesTest {
	
	private static String RESOURCE_DIRECTORY = "./src/test/resources/files";
	
	
	@Test(expected =UnmarshalException.class)	
	public void parseFailXmlFileToGateAssignmentClass() throws Exception{
		File file = new File(RESOURCE_DIRECTORY);
		IntegrationLayerTransformationUtils.	getClassFromXmlFile(GateAssignment.class, file);		
	}
	
	
	@Test
	public void parseXmlFileToGateAssignmentClass() throws Exception{
		File file = new File(RESOURCE_DIRECTORY+"/ArrivalGateAssignment.xml");
		GateAssignment gateIdentifier = IntegrationLayerTransformationUtils.
				getClassFromXmlFile(GateAssignment.class, file);
		assertNotNull(gateIdentifier);
		assertEquals(gateIdentifier.getArrivalGate(), "7");
		assertNotNull(gateIdentifier.getEventInfo());
		assertEquals(gateIdentifier.getEventInfo().getEventId(), "139879277");
		assertEquals(gateIdentifier.getEventInfo().getCreationDatetime(), "2015/07/15 14:30:28 470 GMT");
		assertEquals(gateIdentifier.getEventInfo().getRequestId(), "28105324");
		assertEquals(gateIdentifier.getEventInfo().getTopicName(), "SWA.OPNL_SEG.FLT.GATE_ASGT");
		assertEquals(gateIdentifier.getEventInfo().getTotalEventCount(), "2");
		assertEquals(gateIdentifier.getEventInfo().getTopicCounts().length, 2);
		assertEquals(gateIdentifier.getEventInfo().getTopicCounts()[0].getTopicName(), "SWA.IATA.GATE.MVT");
		assertEquals(gateIdentifier.getEventInfo().getTopicCounts()[0].getTopicCount(), "1");
		assertEquals(gateIdentifier.getEventInfo().getTopicCounts()[1].getTopicName(), "SWA.OPNL_SEG.FLT.GATE_ASGT");
		assertEquals(gateIdentifier.getEventInfo().getTopicCounts()[1].getTopicCount(), "1");
		assertNotNull(gateIdentifier.getOperationalFlightLegKey());
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getOperatingCarrier(), "WN");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledFlightNumber(), "3");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getFlightLegInstanceNumber(), "0");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduleDate(), "20150715");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledDepartureDatetime(), "2015/07/15 12:30:00 GMT");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledArrivalDatetime(), "2015/07/15 13:30:00 GMT");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledDepartureStationCode(), "HOU");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledArrivalStationCode(), "DAL");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getArrivalStationCode(), "DAL");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledDepartureStationTimeZone(), "America/Chicago");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledArrivalStationTimeZone(), "America/Chicago");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getArrivalStationTimeZone(), "America/Chicago");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getFlightTypeCode(), "SCHEDULED");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getFlightStateCode(), "NORMAL");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getForSale(), "true");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getTailNumber(), "N404WN");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getNoseNumber(), "N404");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getEquipmentTypeCode(), "73W");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getCapacity(), "143");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getSchdDepCentralTzOffset(), "-5");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getSchdDepStnTzOffset(), "-5");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getSchdArrCentralTzOffset(), "-5");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getSchdArrStnTzOffset(), "-5");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getWifiEquipt(), "true");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledMissionType(), "C1");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getActualMissionType(), "C1");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getOperationType(), "Domestic");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledEquipmentTypeCode(), "73W");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledACV(), "Y143");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getaCV(), "Y143");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getMarketingFlights().getMarketingFlightNumber(), "3");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getMarketingFlights().getMarketingCarrier(), "WN");
		assertNotNull(gateIdentifier.getArrivalGateIdentifier());
		assertEquals(gateIdentifier.getArrivalGateIdentifier().getNewGate(), "7");
	}
	
	@Test
	public void parseXmlFileToUnAssingnedGateAssignmentClass() throws Exception{
		File file = new File(RESOURCE_DIRECTORY+"/ArrivalUnAssignedGate.xml");
		
		GateAssignment gateIdentifier = IntegrationLayerTransformationUtils.
				getClassFromXmlFile(GateAssignment.class, file);
					
		assertNotNull(gateIdentifier);
		assertNull(gateIdentifier.getArrivalGate());
		assertNotNull(gateIdentifier.getEventInfo());
		assertEquals(gateIdentifier.getEventInfo().getEventId(), "139921839");
		assertEquals(gateIdentifier.getEventInfo().getCreationDatetime(), "2015/07/20 14:06:28 935 GMT");
		assertEquals(gateIdentifier.getEventInfo().getRequestId(), "28117902");
		assertEquals(gateIdentifier.getEventInfo().getTopicName(), "SWA.OPNL_SEG.FLT.GATE_ASGT");
		assertEquals(gateIdentifier.getEventInfo().getTotalEventCount(), "2");
		assertEquals(gateIdentifier.getEventInfo().getTopicCounts().length, 2);
		assertEquals(gateIdentifier.getEventInfo().getTopicCounts()[0].getTopicName(), "SWA.IATA.GATE.MVT");
		assertEquals(gateIdentifier.getEventInfo().getTopicCounts()[0].getTopicCount(), "1");
		assertEquals(gateIdentifier.getEventInfo().getTopicCounts()[1].getTopicName(), "SWA.OPNL_SEG.FLT.GATE_ASGT");
		assertEquals(gateIdentifier.getEventInfo().getTopicCounts()[1].getTopicCount(), "1");
		assertNotNull(gateIdentifier.getOperationalFlightLegKey());
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getOperatingCarrier(), "WN");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledFlightNumber(), "714");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getFlightLegInstanceNumber(), "0");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduleDate(), "20150720");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledDepartureDatetime(), "2015/07/20 11:00:00 GMT");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledArrivalDatetime(), "2015/07/20 12:05:00 GMT");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledDepartureStationCode(), "LBB");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledArrivalStationCode(), "DAL");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getArrivalStationCode(), "DAL");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledDepartureStationTimeZone(), "America/Chicago");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledArrivalStationTimeZone(), "America/Chicago");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getArrivalStationTimeZone(), "America/Chicago");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getFlightTypeCode(), "SCHEDULED");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getFlightStateCode(), "NORMAL");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getForSale(), "true");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getTailNumber(), "N614SW");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getNoseNumber(), "N614");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getEquipmentTypeCode(), "73C");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getCapacity(), "143");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getSchdDepCentralTzOffset(), "-5");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getSchdDepStnTzOffset(), "-5");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getSchdArrCentralTzOffset(), "-5");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getSchdArrStnTzOffset(), "-5");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getWifiEquipt(), "false");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledMissionType(), "C1");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getActualMissionType(), "C1");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getOperationType(), "Domestic");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledEquipmentTypeCode(), "735");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getScheduledACV(), "Y122");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getaCV(), "Y143");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getMarketingFlights().getMarketingFlightNumber(), "714");
		assertEquals(gateIdentifier.getOperationalFlightLegKey().getMarketingFlights().getMarketingCarrier(), "WN");
		assertNotNull(gateIdentifier.getArrivalGateIdentifier());
		assertEquals(gateIdentifier.getArrivalGateIdentifier().getOriginalGate(), "6");
	}
	
}
