import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import generated.GateAssignment;
import generated.GateAssignment.EventInfo;
import generated.GateAssignment.OperationalFlightLegKey;
import generated.GateAssignment.OperationalFlightLegKey.MarketingFlights;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TransformationTest {

	@Mock
	GateAssignment gateAssignment;

	@Mock
	MarketingFlights marketingFlights;

	@Mock
	OperationalFlightLegKey operationalFlightLegKey;
	
	@Mock
	EventInfo eventInfo;

	@Test
	public void testArrivalGateTrasformation() throws Exception {
		String result = "GIA;WN3/15JUL2015.N404WN.DAL;GTE 7;SI Request_ID=28105324;SI Event_ID=139879277;";
		when(marketingFlights.getMarketingCarrier()).thenReturn("WN");
		when(marketingFlights.getMarketingFlightNumber()).thenReturn(3);
		when(gateAssignment.getOperationalFlightLegKey()).thenReturn(operationalFlightLegKey);
		when(gateAssignment.getArrivalGate()).thenReturn((byte)7);
		when(operationalFlightLegKey.getScheduleDate()).thenReturn("20150715");
		when(operationalFlightLegKey.getMarketingFlights()).thenReturn(marketingFlights);
		when(operationalFlightLegKey.getTailNumber()).thenReturn("N404WN");
		when(gateAssignment.getEventInfo()).thenReturn(eventInfo);
		when(eventInfo.getRequestId()).thenReturn("28105324");
		when(eventInfo.getEventId()).thenReturn("139879277");
		assertEquals(result, IATATransformer.transform(gateAssignment));
	}

	@Test
	public void testArrivalUnGateTrasformation() throws Exception {
		String result = "GIA;WN714/20JUL2015.N614SW.DAL;GTE XXXXX;SI Request_ID=28117902;SI Event_ID=139921839;";
		when(marketingFlights.getMarketingCarrier()).thenReturn("WN");
		when(marketingFlights.getMarketingFlightNumber()).thenReturn(714);
		when(gateAssignment.getOperationalFlightLegKey()).thenReturn(operationalFlightLegKey);
		when(gateAssignment.getArrivalGate()).thenReturn(null);
		when(operationalFlightLegKey.getScheduleDate()).thenReturn("20150720");
		when(operationalFlightLegKey.getMarketingFlights()).thenReturn(marketingFlights);
		when(operationalFlightLegKey.getTailNumber()).thenReturn("N614SW");
		when(gateAssignment.getEventInfo()).thenReturn(eventInfo);
		when(eventInfo.getRequestId()).thenReturn("28117902");
		when(eventInfo.getEventId()).thenReturn("139921839");
		assertEquals(result, IATATransformer.transform(gateAssignment));
	}

}
