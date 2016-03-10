import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import generated.GateAssignment;

@RunWith(MockitoJUnitRunner.class)
public class XMLMarshalTest {

	private static final String RESOURCES_PATH = "src/test/resources/";

	@Test
	public void testGetArrivalGateAssignmentFile() throws Exception {

		GateAssignment gateAssignmentTest = XMLUtilsChallenge
				.getGateAssignment(RESOURCES_PATH + "ArrivalGateAssignment.xml");
		assertEquals(new Byte((byte) 7), gateAssignmentTest.getArrivalGate());
		assertEquals(new Byte((byte) 7), gateAssignmentTest.getArrivalGateIdentifier().getNewGate());
		assertEquals(null, gateAssignmentTest.getArrivalGateIdentifier().getOriginalGate());
		assertEquals("", gateAssignmentTest.getArrivalGateIdentifier().getValue());
		assertEquals("2015/07/15 14:30:28 470 GMT", gateAssignmentTest.getEventInfo().getCreationDatetime());
		assertEquals("139879277", gateAssignmentTest.getEventInfo().getEventId());
		assertEquals("28105324", gateAssignmentTest.getEventInfo().getRequestId());
		assertEquals("SWA.OPNL_SEG.FLT.GATE_ASGT", gateAssignmentTest.getEventInfo().getTopicName());
		assertEquals(new Byte((byte) 2), gateAssignmentTest.getEventInfo().getTotalEventCount());
		assertEquals(2, gateAssignmentTest.getEventInfo().getTopicCounts().size());
		assertEquals(new Byte((byte) 1), gateAssignmentTest.getEventInfo().getTopicCounts().get(0).getTopicCount());
		assertEquals("SWA.IATA.GATE.MVT", gateAssignmentTest.getEventInfo().getTopicCounts().get(0).getTopicName());
		assertEquals("", gateAssignmentTest.getEventInfo().getTopicCounts().get(0).getValue());
		assertEquals(new Byte((byte) 1), gateAssignmentTest.getEventInfo().getTopicCounts().get(1).getTopicCount());
		assertEquals("SWA.OPNL_SEG.FLT.GATE_ASGT",
				gateAssignmentTest.getEventInfo().getTopicCounts().get(1).getTopicName());
		assertEquals("", gateAssignmentTest.getEventInfo().getTopicCounts().get(1).getValue());
		assertEquals("C1", gateAssignmentTest.getOperationalFlightLegKey().getActualMissionType());
		assertEquals("Y143", gateAssignmentTest.getOperationalFlightLegKey().getACV());
		assertEquals("DAL", gateAssignmentTest.getOperationalFlightLegKey().getArrivalStationCode());
		assertEquals("America/Chicago", gateAssignmentTest.getOperationalFlightLegKey().getArrivalStationTimeZone());
		assertEquals(new Short((short) 143), gateAssignmentTest.getOperationalFlightLegKey().getCapacity());
		assertEquals("73W", gateAssignmentTest.getOperationalFlightLegKey().getEquipmentTypeCode());
		assertEquals(new Byte((byte) 0), gateAssignmentTest.getOperationalFlightLegKey().getFlightLegInstanceNumber());
		assertEquals("NORMAL", gateAssignmentTest.getOperationalFlightLegKey().getFlightStateCode());
		assertEquals("SCHEDULED", gateAssignmentTest.getOperationalFlightLegKey().getFlightTypeCode());
		assertEquals("true", gateAssignmentTest.getOperationalFlightLegKey().getForSale());
		assertEquals("N404", gateAssignmentTest.getOperationalFlightLegKey().getNoseNumber());
		assertEquals("WN", gateAssignmentTest.getOperationalFlightLegKey().getOperatingCarrier());
		assertEquals("Domestic", gateAssignmentTest.getOperationalFlightLegKey().getOperationType());
		assertEquals(new Byte((byte) -5), gateAssignmentTest.getOperationalFlightLegKey().getSchdArrCentralTzOffset());
		assertEquals(new Byte((byte) -5), gateAssignmentTest.getOperationalFlightLegKey().getSchdArrStnTzOffset());
		assertEquals(new Byte((byte) -5), gateAssignmentTest.getOperationalFlightLegKey().getSchdDepCentralTzOffset());
		assertEquals(new Byte((byte) -5), gateAssignmentTest.getOperationalFlightLegKey().getSchdDepStnTzOffset());
		assertEquals("Y143", gateAssignmentTest.getOperationalFlightLegKey().getScheduledACV());
		assertEquals("2015/07/15 13:30:00 GMT",
				gateAssignmentTest.getOperationalFlightLegKey().getScheduledArrivalDatetime());
		assertEquals("DAL", gateAssignmentTest.getOperationalFlightLegKey().getScheduledArrivalStationCode());
		assertEquals("America/Chicago",
				gateAssignmentTest.getOperationalFlightLegKey().getScheduledArrivalStationTimeZone());
		assertEquals("20150715", gateAssignmentTest.getOperationalFlightLegKey().getScheduleDate());
		assertEquals("2015/07/15 12:30:00 GMT",
				gateAssignmentTest.getOperationalFlightLegKey().getScheduledDepartureDatetime());
		assertEquals("HOU", gateAssignmentTest.getOperationalFlightLegKey().getScheduledDepartureStationCode());
		assertEquals("America/Chicago",
				gateAssignmentTest.getOperationalFlightLegKey().getScheduledDepartureStationTimeZone());
		assertEquals("73W", gateAssignmentTest.getOperationalFlightLegKey().getScheduledEquipmentTypeCode());
		assertEquals(new Byte((byte) 3), gateAssignmentTest.getOperationalFlightLegKey().getScheduledFlightNumber());
		assertEquals("C1", gateAssignmentTest.getOperationalFlightLegKey().getScheduledMissionType());
		assertEquals("N404WN", gateAssignmentTest.getOperationalFlightLegKey().getTailNumber());
		assertEquals("true", gateAssignmentTest.getOperationalFlightLegKey().getWifiEquipt());
		assertEquals("WN", gateAssignmentTest.getOperationalFlightLegKey().getMarketingFlights().getMarketingCarrier());
		assertEquals(new Integer(3),
				gateAssignmentTest.getOperationalFlightLegKey().getMarketingFlights().getMarketingFlightNumber());
		assertEquals("", gateAssignmentTest.getOperationalFlightLegKey().getMarketingFlights().getValue());
	}

	@Test(expected = FileNotFoundException.class)
	public void testGetArrivalGateAssignmentFileNotFound() throws IOException, JAXBException {
		GateAssignment gateAssignmentTest = XMLUtilsChallenge
				.getGateAssignment(RESOURCES_PATH + "ArrivalGateAssignment02.xml");
	}

	@Test
	public void testGetArrivalGateUnAssignmentFile() throws Exception {
		GateAssignment gateAssignmentTest = XMLUtilsChallenge
				.getGateAssignment(RESOURCES_PATH + "ArrivalUnAssignedGate.xml");
		assertEquals(null, gateAssignmentTest.getArrivalGate());
		assertEquals(null, gateAssignmentTest.getArrivalGateIdentifier().getNewGate());
		assertEquals("", gateAssignmentTest.getArrivalGateIdentifier().getValue());
		assertEquals("2015/07/20 14:06:28 935 GMT", gateAssignmentTest.getEventInfo().getCreationDatetime());
		assertEquals("139921839", gateAssignmentTest.getEventInfo().getEventId());
		assertEquals("28117902", gateAssignmentTest.getEventInfo().getRequestId());
		assertEquals("SWA.OPNL_SEG.FLT.GATE_ASGT", gateAssignmentTest.getEventInfo().getTopicName());
		assertEquals(new Byte((byte) 2), gateAssignmentTest.getEventInfo().getTotalEventCount());
		assertEquals(2, gateAssignmentTest.getEventInfo().getTopicCounts().size());
		assertEquals(new Byte((byte) 1), gateAssignmentTest.getEventInfo().getTopicCounts().get(0).getTopicCount());
		assertEquals("SWA.IATA.GATE.MVT", gateAssignmentTest.getEventInfo().getTopicCounts().get(0).getTopicName());
		assertEquals("", gateAssignmentTest.getEventInfo().getTopicCounts().get(0).getValue());
		assertEquals(new Byte((byte) 1), gateAssignmentTest.getEventInfo().getTopicCounts().get(1).getTopicCount());
		assertEquals("SWA.OPNL_SEG.FLT.GATE_ASGT",
				gateAssignmentTest.getEventInfo().getTopicCounts().get(1).getTopicName());
		assertEquals("", gateAssignmentTest.getEventInfo().getTopicCounts().get(1).getValue());
		assertEquals("C1", gateAssignmentTest.getOperationalFlightLegKey().getActualMissionType());
		assertEquals("Y143", gateAssignmentTest.getOperationalFlightLegKey().getACV());
		assertEquals("DAL", gateAssignmentTest.getOperationalFlightLegKey().getArrivalStationCode());
		assertEquals("America/Chicago", gateAssignmentTest.getOperationalFlightLegKey().getArrivalStationTimeZone());
		assertEquals(new Short((short) 143), gateAssignmentTest.getOperationalFlightLegKey().getCapacity());
		assertEquals("73C", gateAssignmentTest.getOperationalFlightLegKey().getEquipmentTypeCode());
		assertEquals(new Byte((byte) 0), gateAssignmentTest.getOperationalFlightLegKey().getFlightLegInstanceNumber());
		assertEquals("NORMAL", gateAssignmentTest.getOperationalFlightLegKey().getFlightStateCode());
		assertEquals("SCHEDULED", gateAssignmentTest.getOperationalFlightLegKey().getFlightTypeCode());
		assertEquals("true", gateAssignmentTest.getOperationalFlightLegKey().getForSale());
		assertEquals("N614", gateAssignmentTest.getOperationalFlightLegKey().getNoseNumber());
		assertEquals("WN", gateAssignmentTest.getOperationalFlightLegKey().getOperatingCarrier());
		assertEquals("Domestic", gateAssignmentTest.getOperationalFlightLegKey().getOperationType());
		assertEquals(new Byte((byte) -5), gateAssignmentTest.getOperationalFlightLegKey().getSchdArrCentralTzOffset());
		assertEquals(new Byte((byte) -5), gateAssignmentTest.getOperationalFlightLegKey().getSchdArrStnTzOffset());
		assertEquals(new Byte((byte) -5), gateAssignmentTest.getOperationalFlightLegKey().getSchdDepCentralTzOffset());
		assertEquals(new Byte((byte) -5), gateAssignmentTest.getOperationalFlightLegKey().getSchdDepStnTzOffset());
		assertEquals("Y122", gateAssignmentTest.getOperationalFlightLegKey().getScheduledACV());
		assertEquals("2015/07/20 12:05:00 GMT",
				gateAssignmentTest.getOperationalFlightLegKey().getScheduledArrivalDatetime());
		assertEquals("DAL", gateAssignmentTest.getOperationalFlightLegKey().getScheduledArrivalStationCode());
		assertEquals("America/Chicago",
				gateAssignmentTest.getOperationalFlightLegKey().getScheduledArrivalStationTimeZone());
		assertEquals("20150720", gateAssignmentTest.getOperationalFlightLegKey().getScheduleDate());
		assertEquals("2015/07/20 11:00:00 GMT",
				gateAssignmentTest.getOperationalFlightLegKey().getScheduledDepartureDatetime());
		assertEquals("LBB", gateAssignmentTest.getOperationalFlightLegKey().getScheduledDepartureStationCode());
		assertEquals("America/Chicago",
				gateAssignmentTest.getOperationalFlightLegKey().getScheduledDepartureStationTimeZone());
		assertEquals("735", gateAssignmentTest.getOperationalFlightLegKey().getScheduledEquipmentTypeCode());
		assertEquals(new Byte((byte) 714), gateAssignmentTest.getOperationalFlightLegKey().getScheduledFlightNumber());
		assertEquals("C1", gateAssignmentTest.getOperationalFlightLegKey().getScheduledMissionType());
		assertEquals("N614SW", gateAssignmentTest.getOperationalFlightLegKey().getTailNumber());
		assertEquals("false", gateAssignmentTest.getOperationalFlightLegKey().getWifiEquipt());
		assertEquals("WN", gateAssignmentTest.getOperationalFlightLegKey().getMarketingFlights().getMarketingCarrier());
		assertEquals(new Integer(714),
				gateAssignmentTest.getOperationalFlightLegKey().getMarketingFlights().getMarketingFlightNumber());
		assertEquals("", gateAssignmentTest.getOperationalFlightLegKey().getMarketingFlights().getValue());
	}

}
