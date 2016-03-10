package com.challenge.file.review;

import static org.junit.Assert.*;

import java.io.File;

import javax.xml.transform.stream.StreamSource;

import org.junit.Test;
import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.challenge.arrival.GateAssignment;

public class FileTest {
	
	@Test
	public void verifySpringReaderFileArrivalGateAssigment(){
		//Test Process Element --  HappyPath
		//1. Mockear un GateAssignment para verificar el ElementProcessor.
		try {
			StaxEventItemReader<GateAssignment> reader = new StaxEventItemReader<GateAssignment>();
			reader.setFragmentRootElementName("GateAssignment");
			reader.setSaveState(true);
			Jaxb2Marshaller jax = new Jaxb2Marshaller();
			jax.setClassesToBeBound(GateAssignment.class);
			reader.setUnmarshaller(jax);
			reader.afterPropertiesSet();
			File file = new File("C:/temp/ArrivalGateAssignment.xml");
			GateAssignment gateAssignment = (GateAssignment) jax.unmarshal(new StreamSource(file));	
			assertEquals("7",gateAssignment.getArrivalGate());
			//--EventInfo
			assertEquals("139879277",gateAssignment.getEventInfo().getEventID());
			assertEquals("2015/07/15 14:30:28 470 GMT",gateAssignment.getEventInfo().getCreationDateTime());
			assertEquals("28105324",gateAssignment.getEventInfo().getRequestId());
			assertEquals("SWA.OPNL_SEG.FLT.GATE_ASGT",gateAssignment.getEventInfo().getTopicName());
			assertEquals("2",gateAssignment.getEventInfo().getTotalEventCount());
			//---TopicCounts
			assertEquals(2,gateAssignment.getEventInfo().getTopicCounts().size());
			assertEquals("SWA.IATA.GATE.MVT",gateAssignment.getEventInfo().getTopicCounts().get(0).getTopicName());
			assertEquals("1",gateAssignment.getEventInfo().getTopicCounts().get(0).getTopicCount());
			assertEquals("SWA.OPNL_SEG.FLT.GATE_ASGT",gateAssignment.getEventInfo().getTopicCounts().get(1).getTopicName());
			assertEquals("1",gateAssignment.getEventInfo().getTopicCounts().get(1).getTopicCount());
			//--OperationalFlightLegKey
			assertEquals("WN",gateAssignment.getOperationalFlightLegKey().getOperatingCarrier());
			assertEquals("3",gateAssignment.getOperationalFlightLegKey().getScheduledFlightNumber());
			assertEquals("0",gateAssignment.getOperationalFlightLegKey().getFlightLegInstanceNumber());
			assertEquals("20150715",gateAssignment.getOperationalFlightLegKey().getScheduleDate());
			assertEquals("2015/07/15 12:30:00 GMT",gateAssignment.getOperationalFlightLegKey().getScheduledDepartureDatetime());
			assertEquals("2015/07/15 13:30:00 GMT",gateAssignment.getOperationalFlightLegKey().getScheduledArrivalDatetime());
			assertEquals("HOU",gateAssignment.getOperationalFlightLegKey().getScheduledDepartureStationCode());
			assertEquals("DAL",gateAssignment.getOperationalFlightLegKey().getScheduledArrivalStationCode());
			assertEquals("DAL",gateAssignment.getOperationalFlightLegKey().getArrivalStationCode());
			assertEquals("America/Chicago",gateAssignment.getOperationalFlightLegKey().getScheduledDepartureStationTimeZone());
			assertEquals("America/Chicago",gateAssignment.getOperationalFlightLegKey().getScheduledArrivalStationTimeZone());
			assertEquals("America/Chicago",gateAssignment.getOperationalFlightLegKey().getArrivalStationTimeZone());
			assertEquals("SCHEDULED",gateAssignment.getOperationalFlightLegKey().getFlightTypeCode());
			assertEquals("NORMAL",gateAssignment.getOperationalFlightLegKey().getFlightStateCode());
			assertEquals("true",gateAssignment.getOperationalFlightLegKey().getForSale());
			assertEquals("N404WN",gateAssignment.getOperationalFlightLegKey().getTailNumber());
			assertEquals("N404",gateAssignment.getOperationalFlightLegKey().getNoseNumber());
			assertEquals("73W",gateAssignment.getOperationalFlightLegKey().getEquipmentTypeCode());
			assertEquals("143",gateAssignment.getOperationalFlightLegKey().getCapacity());
			assertEquals("-5",gateAssignment.getOperationalFlightLegKey().getSchdDepCentralTzOffset());
			assertEquals("-5",gateAssignment.getOperationalFlightLegKey().getSchdDepStnTzOffset());
			assertEquals("-5",gateAssignment.getOperationalFlightLegKey().getSchdArrCentralTzOffset());
			assertEquals("-5",gateAssignment.getOperationalFlightLegKey().getSchdArrStnTzOffset());
			assertEquals("true",gateAssignment.getOperationalFlightLegKey().getWifiEquipt());
			assertEquals("C1",gateAssignment.getOperationalFlightLegKey().getScheduledMissionType());
			assertEquals("C1",gateAssignment.getOperationalFlightLegKey().getActualMissionType());
			assertEquals("Domestic",gateAssignment.getOperationalFlightLegKey().getOperationType());
			assertEquals("73W",gateAssignment.getOperationalFlightLegKey().getScheduledEquipmentTypeCode());
			assertEquals("Y143",gateAssignment.getOperationalFlightLegKey().getScheduledACV());
			assertEquals("Y143",gateAssignment.getOperationalFlightLegKey().getAcv());
			//---MarketingFlights
			assertEquals("WN",gateAssignment.getOperationalFlightLegKey().getMarketingFlight().getMarketingCarrier());
			assertEquals("3",gateAssignment.getOperationalFlightLegKey().getMarketingFlight().getMarketingFlightNumber());
			//---ArrivalGateIdentifier
			assertEquals("7",gateAssignment.getArrivalGateIdentifier().getNewGate());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void verifySpringReaderFileArrivalUnAssignedGate(){
		//Test Process Element --  HappyPath
		//1. Mockear un GateAssignment para verificar el ElementProcessor.
		try {
			StaxEventItemReader<GateAssignment> reader = new StaxEventItemReader<GateAssignment>();
			reader.setFragmentRootElementName("GateAssignment");
			reader.setSaveState(true);
			Jaxb2Marshaller jax = new Jaxb2Marshaller();
			jax.setClassesToBeBound(GateAssignment.class);
			reader.setUnmarshaller(jax);
			reader.afterPropertiesSet();
			File file = new File("C:/temp/ArrivalUnAssignedGate.xml");
			GateAssignment gateAssignment = (GateAssignment) jax.unmarshal(new StreamSource(file));	
			assertEquals(null,gateAssignment.getArrivalGate());
			//--EventInfo
			assertEquals("139921839",gateAssignment.getEventInfo().getEventID());
			assertEquals("2015/07/20 14:06:28 935 GMT",gateAssignment.getEventInfo().getCreationDateTime());
			assertEquals("28117902",gateAssignment.getEventInfo().getRequestId());
			assertEquals("SWA.OPNL_SEG.FLT.GATE_ASGT",gateAssignment.getEventInfo().getTopicName());
			assertEquals("2",gateAssignment.getEventInfo().getTotalEventCount());
			//---TopicCounts
			assertEquals(2,gateAssignment.getEventInfo().getTopicCounts().size());
			assertEquals("SWA.IATA.GATE.MVT",gateAssignment.getEventInfo().getTopicCounts().get(0).getTopicName());
			assertEquals("1",gateAssignment.getEventInfo().getTopicCounts().get(0).getTopicCount());
			assertEquals("SWA.OPNL_SEG.FLT.GATE_ASGT",gateAssignment.getEventInfo().getTopicCounts().get(1).getTopicName());
			assertEquals("1",gateAssignment.getEventInfo().getTopicCounts().get(1).getTopicCount());
			//--OperationalFlightLegKey
			assertEquals("WN",gateAssignment.getOperationalFlightLegKey().getOperatingCarrier());
			assertEquals("714",gateAssignment.getOperationalFlightLegKey().getScheduledFlightNumber());
			assertEquals("0",gateAssignment.getOperationalFlightLegKey().getFlightLegInstanceNumber());
			assertEquals("20150720",gateAssignment.getOperationalFlightLegKey().getScheduleDate());
			assertEquals("2015/07/20 11:00:00 GMT",gateAssignment.getOperationalFlightLegKey().getScheduledDepartureDatetime());
			assertEquals("2015/07/20 12:05:00 GMT",gateAssignment.getOperationalFlightLegKey().getScheduledArrivalDatetime());
			assertEquals("LBB",gateAssignment.getOperationalFlightLegKey().getScheduledDepartureStationCode());
			assertEquals("DAL",gateAssignment.getOperationalFlightLegKey().getScheduledArrivalStationCode());
			assertEquals("DAL",gateAssignment.getOperationalFlightLegKey().getArrivalStationCode());
			assertEquals("America/Chicago",gateAssignment.getOperationalFlightLegKey().getScheduledDepartureStationTimeZone());
			assertEquals("America/Chicago",gateAssignment.getOperationalFlightLegKey().getScheduledArrivalStationTimeZone());
			assertEquals("America/Chicago",gateAssignment.getOperationalFlightLegKey().getArrivalStationTimeZone());
			assertEquals("SCHEDULED",gateAssignment.getOperationalFlightLegKey().getFlightTypeCode());
			assertEquals("NORMAL",gateAssignment.getOperationalFlightLegKey().getFlightStateCode());
			assertEquals("true",gateAssignment.getOperationalFlightLegKey().getForSale());
			assertEquals("N614SW",gateAssignment.getOperationalFlightLegKey().getTailNumber());
			assertEquals("N614",gateAssignment.getOperationalFlightLegKey().getNoseNumber());
			assertEquals("73C",gateAssignment.getOperationalFlightLegKey().getEquipmentTypeCode());
			assertEquals("143",gateAssignment.getOperationalFlightLegKey().getCapacity());
			assertEquals("-5",gateAssignment.getOperationalFlightLegKey().getSchdDepCentralTzOffset());
			assertEquals("-5",gateAssignment.getOperationalFlightLegKey().getSchdDepStnTzOffset());
			assertEquals("-5",gateAssignment.getOperationalFlightLegKey().getSchdArrCentralTzOffset());
			assertEquals("-5",gateAssignment.getOperationalFlightLegKey().getSchdArrStnTzOffset());
			assertEquals("false",gateAssignment.getOperationalFlightLegKey().getWifiEquipt());
			assertEquals("C1",gateAssignment.getOperationalFlightLegKey().getScheduledMissionType());
			assertEquals("C1",gateAssignment.getOperationalFlightLegKey().getActualMissionType());
			assertEquals("Domestic",gateAssignment.getOperationalFlightLegKey().getOperationType());
			assertEquals("735",gateAssignment.getOperationalFlightLegKey().getScheduledEquipmentTypeCode());
			assertEquals("Y122",gateAssignment.getOperationalFlightLegKey().getScheduledACV());
			assertEquals("Y143",gateAssignment.getOperationalFlightLegKey().getAcv());
			//---MarketingFlights
			assertEquals("WN",gateAssignment.getOperationalFlightLegKey().getMarketingFlight().getMarketingCarrier());
			assertEquals("714",gateAssignment.getOperationalFlightLegKey().getMarketingFlight().getMarketingFlightNumber());
			//---ArrivalGateIdentifier
			assertEquals(null,gateAssignment.getArrivalGateIdentifier().getNewGate());
			assertEquals("6",gateAssignment.getArrivalGateIdentifier().getOriginalGate());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
