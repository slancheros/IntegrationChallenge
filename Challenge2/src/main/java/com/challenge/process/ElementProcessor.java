package com.challenge.process;


import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.challenge.arrival.GateAssignment;
import com.challenge.write.PlainTextElement;

@Component
public class ElementProcessor implements ItemProcessor<GateAssignment, PlainTextElement> {

	public PlainTextElement process(GateAssignment item) throws Exception {
		final String anotherElementId = item.getEventInfo().getTopicName() + "::" + item.getEventInfo().getEventID();
        return new PlainTextElement(anotherElementId);
	}
    
}