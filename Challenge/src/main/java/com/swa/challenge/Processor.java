package com.swa.challenge;

import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.swa.challenge.model.GateAssignment;
import com.swa.challenge.util.Constants;
import com.swa.challenge.util.ProcessorUtils;

public class Processor {

    private InputStream source;
    private String iataStr;
    private GateAssignment assignment;

    public Processor(InputStream source) {
        this.source = source;
    }

    public void process() throws Exception {
        this.read();
        this.transform();
    }

    private void read() throws JAXBException, FileNotFoundException {    
        if(null == source) {
            throw new FileNotFoundException();
        } else {
            JAXBContext jaxbContext = null;
            jaxbContext = JAXBContext.newInstance(GateAssignment.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            this.assignment = (GateAssignment) jaxbUnmarshaller.unmarshal(source);
        }
    }

    private void transform() throws Exception {
        StringBuilder result = new StringBuilder("");
        result.append(Constants.GIA);
        result.append(Constants.X_A);
        result.append(assignment.getOperationalFlightLegKey().getOperatingCarrier());
        result.append(assignment.getOperationalFlightLegKey().getScheduledFlightNumber());
        result.append(Constants.SLASH);
        result.append(ProcessorUtils.getArrivalDate(assignment.getOperationalFlightLegKey().getScheduledArrivalDatetime(), result));
        result.append(Constants.PERIOD);
        result.append(assignment.getOperationalFlightLegKey().getTailNumber());
        result.append(Constants.PERIOD);
        result.append(assignment.getOperationalFlightLegKey().getScheduledArrivalStationCode());
        result.append(Constants.X_A);
        result.append(Constants.GTE_7);
        result.append(Constants.X_A);
        result.append(Constants.SI);
        result.append(Constants.REQUEST_ID);
        result.append(assignment.getEventInfo().getRequestId());
        result.append(Constants.X_A);
        result.append(Constants.SI);
        result.append(Constants.EVENT_ID);
        result.append(assignment.getEventInfo().getEventId());
        result.append(Constants.X_A);

        this.iataStr = result.toString();
    }
    
    public String print() {
        return this.iataStr;
    }
    
    // getters and setters (accessors and mutators)

   

}
