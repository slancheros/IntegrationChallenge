package com.swacorp.mx.sf.integration;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.swacorp.mx.sf.integration.converters.EventIDConverter;
import com.swacorp.mx.sf.integration.converters.GIAArrivalStationCodeConverter;
import com.swacorp.mx.sf.integration.converters.GateConverter;
import com.swacorp.mx.sf.integration.converters.IntegrationLayerConverter;
import com.swacorp.mx.sf.integration.converters.RequestIDConverter;
import com.swacorp.mx.sf.integration.domain.DataSAP;
import com.swacorp.mx.sf.integration.domain.EventInfo;
import com.swacorp.mx.sf.integration.domain.GateAssignment;
import com.swacorp.mx.sf.integration.domain.OperationalFlightLegKey;
import com.swacorp.mx.sf.integration.utils.IntegrationLayerTransformationUtils;

public class TransformDataTest {

	
	@Test	
	public void transformGateAssignmentClass() throws Exception{
		GateAssignment gateAssignment = getGateAssignment();
		String transformedGateAssignment = IntegrationLayerTransformationUtils.transformGateAssignmentToSAPFormat(gateAssignment);
		assertEquals(transformedGateAssignment, "GIA&#xA;WN714/20JUL2015.N614SW.DAL&#xA;GTE XXXXX&#xA;"
				+ "SI Request_ID=28117902&#xA;SI Event_ID=139921839&#xA;\n");
	}

	@Test	
	public void transformGateAssignmentWithDozer(){
		GateAssignment gateAssignment = getGateAssignment();
		DataSAP data= IntegrationLayerTransformationUtils.convertGateAssignmentToSAPWithDozer(gateAssignment);
		assertEquals(data.getData(), "GIA&#xA;WN714/20JUL2015.N614SW.DAL&#xA;GTE XXXXX&#xA;"
				+ "SI Request_ID=28117902&#xA;SI Event_ID=139921839&#xA;\n");
	}
	
	
	@Test	
	public void transformGateUnAssignmentClass() throws Exception{
		GateAssignment gateAssignment = getGateUnAssignment();
		String transformedGateAssignment = IntegrationLayerTransformationUtils.transformGateAssignmentToSAPFormat(gateAssignment);
		assertEquals(transformedGateAssignment, "GIA&#xA;WN3/15JUL2015.N404WN.DAL&#xA;GTE 7&#xA;"
				+ "SI Request_ID=28105324&#xA;SI Event_ID=139879277&#xA;\n");
	}
	
	@Test	
	public void transformGateUnAssignmentWithDozer(){
		GateAssignment gateAssignment = getGateUnAssignment();
		DataSAP data= IntegrationLayerTransformationUtils.convertGateAssignmentToSAPWithDozer(gateAssignment);
		assertEquals(data.getData(), "GIA&#xA;WN3/15JUL2015.N404WN.DAL&#xA;GTE 7&#xA;"
				+ "SI Request_ID=28105324&#xA;SI Event_ID=139879277&#xA;\n");
	}
	
	@Test	
	public void eventIDConverterTest(){
		IntegrationLayerConverter converter = new EventIDConverter();
		String previousValue = "lastMessage";
		String value = "123456";
		String returnValue  = (String) converter.convert(previousValue, value, String.class, String.class);
		assertEquals(returnValue, "lastMessageSI Event_ID=123456&#xA;\n");
	}
	
	@Test	
	public void requestIDConverterTest(){
		IntegrationLayerConverter eventIDConverter = new RequestIDConverter();
		String previousValue = "lastMessage";
		String value = "123456";
		String returnValue  = (String) eventIDConverter.convert(previousValue, value, String.class, String.class);
		assertEquals(returnValue, "lastMessageSI Request_ID=123456&#xA;");
	}
	
	@Test	
	public void gateConverterTest(){
		IntegrationLayerConverter eventIDConverter = new GateConverter();
		String previousValue = "lastMessage";
		String value = "7";
		String returnValue  = (String) eventIDConverter.convert(previousValue, value, String.class, String.class);
		assertEquals(returnValue, "lastMessageGTE 7&#xA;");
	}
	
	@Test	
	public void gateConverterTestNull(){
		IntegrationLayerConverter eventIDConverter = new GateConverter();
		String previousValue = "lastMessage";
		String value = null;
		String returnValue  = (String) eventIDConverter.convert(previousValue, value, String.class, String.class);
		assertEquals(returnValue, "lastMessageGTE XXXXX&#xA;");
	}
	
	@Test	
	public void giaArrivalStationConverterTest(){
		IntegrationLayerConverter eventIDConverter = new GIAArrivalStationCodeConverter();
		String previousValue = "lastMessage";
		String value = "DAL";
		String returnValue  = (String) eventIDConverter.convert(previousValue, value, String.class, String.class);
		assertEquals(returnValue, "lastMessageDAL&#xA;");
	}


	private GateAssignment getGateUnAssignment() {
		GateAssignment gateAssignment = new GateAssignment();
		OperationalFlightLegKey operationalFlightLegKey = new OperationalFlightLegKey();
		operationalFlightLegKey.setOperatingCarrier("WN");
		operationalFlightLegKey.setScheduledFlightNumber("3");
		operationalFlightLegKey.setScheduleDate("20150715");
		operationalFlightLegKey.setTailNumber("N404WN");
		operationalFlightLegKey.setArrivalStationCode("DAL");
		EventInfo eventInfo = new EventInfo();
		eventInfo.setRequestId("28105324");
		eventInfo.setEventId("139879277");
		gateAssignment.setOperationalFlightLegKey(operationalFlightLegKey);
		gateAssignment.setEventInfo(eventInfo);
		gateAssignment.setArrivalGate("7");
		return gateAssignment;
	}
	
	


	private GateAssignment getGateAssignment() {
		GateAssignment gateAssignment = new GateAssignment();
		OperationalFlightLegKey operationalFlightLegKey = new OperationalFlightLegKey();
		operationalFlightLegKey.setOperatingCarrier("WN");
		operationalFlightLegKey.setScheduledFlightNumber("714");
		operationalFlightLegKey.setScheduleDate("20150720");
		operationalFlightLegKey.setTailNumber("N614SW");
		operationalFlightLegKey.setArrivalStationCode("DAL");
		EventInfo eventInfo = new EventInfo();
		eventInfo.setRequestId("28117902");
		eventInfo.setEventId("139921839");
		gateAssignment.setOperationalFlightLegKey(operationalFlightLegKey);
		gateAssignment.setEventInfo(eventInfo);
		return gateAssignment;
	}
	
}
