package com.swa.challenge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.bind.JAXBException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.swa.challenge.util.ProcessorUtils;

@RunWith(MockitoJUnitRunner.class)
public class ProcessorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void processArrivalAssignmentWhenSuccessTest() throws Exception {
        InputStream arrivalGateIS = this.getClass().getClassLoader().getResourceAsStream("ArrivalGateAssignment.xml");
        Processor processor = new Processor(arrivalGateIS);
        processor.process();
        assertNotNull(processor.print());
        assertEquals("GIA&#xA;WN3/15JUL2015.N404WN.DAL&#xA;GTE 7&#xA;SI Request_ID=28105324&#xA;SI Event_ID=139879277&#xA;", processor.print());
    }
    
    @Test(expected=JAXBException.class)
    public void processArrivalAssignmentWhenFormatIsBadTest() throws Exception {
        InputStream arrivalGateIS = this.getClass().getClassLoader().getResourceAsStream("empty.xml");
        Processor processor = new Processor(arrivalGateIS);
        processor.process();
    }
    
    @Test(expected=FileNotFoundException.class)
    public void processArrivalAssignmentWhenFileNotFoundTest() throws Exception {
        InputStream arrivalGateIS = this.getClass().getClassLoader().getResourceAsStream("empty3.xml");
        Processor processor = new Processor(arrivalGateIS);
        processor.process();
    }
    
    @Test
    public void getArrivalDateTransformationTest() throws Exception {
        String arrivalDate = "2015/07/15 13:30:00 GMT";
        String expectedResult = "15JUL2015";
        String arrivalDateTransformed = ProcessorUtils.getArrivalDate(arrivalDate, new StringBuilder());
        
        assertEquals(expectedResult, arrivalDateTransformed);
    }
    
    @Test(expected=Exception.class)
    public void getArrivalDateWhenArrivalDateEmptyTest() throws Exception {
        String arrivalDate = "";
        ProcessorUtils.getArrivalDate(arrivalDate, new StringBuilder());
    }
    
    @Test(expected=Exception.class)
    public void getArrivalDateWhenArrivalDateNullTest() throws Exception {
        String arrivalDate = null;
        ProcessorUtils.getArrivalDate(arrivalDate, new StringBuilder());
    }
    
    @Test(expected=Exception.class)
    public void getArrivalDateWhenArrivalDateIsNotADateTest() throws Exception {
        String arrivalDate = "bad date";
        ProcessorUtils.getArrivalDate(arrivalDate, new StringBuilder());
    }

}
