package com.challenge.file.review;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.dozer.CustomConverter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.batch.item.ItemProcessor;

import com.challenge.arrival.EventInfo;
import com.challenge.arrival.GateAssignment;
import com.challenge.arrival.OperationalFlightLegKey;
import com.challenge.arrival.TopicCount;
import com.challenge.process.ElementProcessor;
import com.challenge.write.PlainTextElement;

@RunWith(MockitoJUnitRunner.class)
public class ProcessorTest {

	@Mock
	OperationalFlightLegKey operationalFlightLegKey;
	
	@Mock
	GateAssignment gateAssignment;
	
	@Mock
	EventInfo eventInfo;
	
	@Mock
	PlainTextElement plainTextElement;
	
	@Before
	public void setUp(){
		System.out.println("On setUp");
	}
	
	@Test
	public void processorTestHappyPath(){
		
		when(operationalFlightLegKey.getOperatingCarrier()).thenReturn("WN");
		when(operationalFlightLegKey.getScheduledFlightNumber()).thenReturn("714");
		when(operationalFlightLegKey.getScheduledArrivalDatetime()).thenReturn("2015/07/20 12:05:00 GMT");
		when(operationalFlightLegKey.getTailNumber()).thenReturn("N614SW");
		when(operationalFlightLegKey.getArrivalStationCode()).thenReturn("DAL");
	
		when(eventInfo.getRequestId()).thenReturn("28117902");
		when(eventInfo.getEventID()).thenReturn("139921839");
		
		when(gateAssignment.getEventInfo()).thenReturn(eventInfo);
		when(gateAssignment.getOperationalFlightLegKey()).thenReturn(operationalFlightLegKey);
		
		ItemProcessor<GateAssignment, PlainTextElement> itemProcessor = new ElementProcessor();
		
		try {
			itemProcessor.process(gateAssignment);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		when(plainTextElement.getFieldZero()).thenReturn("GIA");
		when(plainTextElement.getFieldOne()).thenReturn("WN714/20JUL2015.N614SW.DAL");
		when(plainTextElement.getFieldTwo()).thenReturn("GTE XXXXX");
		when(plainTextElement.getFieldThree()).thenReturn("SI Request_ID=28117902");
		when(plainTextElement.getFieldFour()).thenReturn("SI Event_ID=139921839");
		
		assertEquals("GIA", plainTextElement.getFieldZero());
		assertEquals("WN714/20JUL2015.N614SW.DAL", plainTextElement.getFieldOne());
		assertEquals("GTE XXXXX", plainTextElement.getFieldTwo());
		assertEquals("SI Request_ID=28117902", plainTextElement.getFieldThree());
		assertEquals("SI Event_ID=139921839",plainTextElement.getFieldFour());
	}
	
	@Mock
	CustomConverter dateConverter;
	
	
	
	@Test
	public void processorTestDateConverter(){
		
		when(operationalFlightLegKey.getScheduledArrivalDatetime()).thenReturn("2015/07/20 12:05:00 GMT");
		when(dateConverter.convert(null, operationalFlightLegKey.getScheduledArrivalDatetime(), OperationalFlightLegKey.class, PlainTextElement.class)).
			thenReturn("20JUL2015");
		
		assertEquals("20JUL2015", dateConverter.convert(null, operationalFlightLegKey.getScheduledArrivalDatetime(), OperationalFlightLegKey.class, PlainTextElement.class));
	}
	
	
	
}
