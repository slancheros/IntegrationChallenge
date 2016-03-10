package com.swacorp.mx.sf.integration.main;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBException;

import com.swacorp.mx.sf.integration.domain.GateAssignment;
import com.swacorp.mx.sf.integration.utils.IntegrationLayerFileUtils;
import com.swacorp.mx.sf.integration.utils.IntegrationLayerTransformationUtils;

public class ReaderMain {

	private static String RESOURCE_DIRECTORY = "./src/test/resources/result";
	private static String RESOURCE_DIRECTORY_FILES = "./src/test/resources/files";
	
	
	public static void main(String[] args) throws JAXBException, IOException, ParseException {
		initProcess(RESOURCE_DIRECTORY_FILES);

	}
	
	public static void initProcess(String fileDirectory) throws JAXBException, IOException, ParseException{
		File[] files =IntegrationLayerFileUtils.getXmlFileFromDirectory(fileDirectory);
		List<GateAssignment> gates = new LinkedList<>();
		for(File file : files){
			gates.add(IntegrationLayerTransformationUtils.getClassFromXmlFile(GateAssignment.class, file));
		}
		for(GateAssignment gate : gates){
			IntegrationLayerFileUtils.appendDataToFile(RESOURCE_DIRECTORY, "IATA", 
					IntegrationLayerTransformationUtils.convertGateAssignmentToSAPWithDozer(gate).getData());
		}
	}

}
