package com.swacorp.mx.sf.integration.utils;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import com.swacorp.mx.sf.integration.domain.DataSAP;
import com.swacorp.mx.sf.integration.domain.GateAssignment;

public class IntegrationLayerTransformationUtils {
	private IntegrationLayerTransformationUtils(){}
	private static final String SEPARATOR = "&#xA;";
	private static Mapper mapper;
	
	static{
		List<String> myMappingFiles = new ArrayList<String>();
		myMappingFiles.add("dozer-mapping.xml");
		mapper = new DozerBeanMapper(myMappingFiles);
	}
	
	
	public static DataSAP convertGateAssignmentToSAPWithDozer(GateAssignment gateAssignment){
		return mapper.map(gateAssignment, DataSAP.class);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getClassFromXmlFile(Class<T> marshallClass,File file) throws JAXBException
	{
		JAXBContext jaxbContext = JAXBContext.newInstance(marshallClass);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return (T) jaxbUnmarshaller.unmarshal(file);
	}
	
	
	
	public static String transformGateAssignmentToSAPFormat(GateAssignment gateAssignment) throws ParseException{
		StringBuffer transformedGateAssignment = new StringBuffer();
		IntegrationLayerTransformationUtils.transformGIATag(transformedGateAssignment,gateAssignment);
		IntegrationLayerTransformationUtils.transformGATETag(transformedGateAssignment,gateAssignment);
		IntegrationLayerTransformationUtils.transformRequestTag(transformedGateAssignment,gateAssignment);
		IntegrationLayerTransformationUtils.transformEventTag(transformedGateAssignment,gateAssignment);
		transformedGateAssignment.append("\n");
		return transformedGateAssignment.toString();
	}
	
	private static void transformGIATag(StringBuffer transformedGateAssignment,GateAssignment gateAssignment) throws ParseException{
		transformedGateAssignment.append("GIA"+SEPARATOR)
		.append(gateAssignment.getOperationalFlightLegKey().getOperatingCarrier())
		.append(gateAssignment.getOperationalFlightLegKey().getScheduledFlightNumber())
		.append("/")
		.append(IntegrationLayerTransformationUtils.
				transformDateFormatUppercase("yyyyMMdd", "ddMMMyyyy", 
						gateAssignment.getOperationalFlightLegKey().getScheduleDate()))
		.append(".")
		.append(gateAssignment.getOperationalFlightLegKey().getTailNumber())
		.append(".")
		.append(gateAssignment.getOperationalFlightLegKey().getArrivalStationCode())
		.append(SEPARATOR);
	}
	
	private static void transformGATETag(StringBuffer transformedGateAssignment,GateAssignment gateAssignment) throws ParseException{
		transformedGateAssignment.append("GTE ");
		String gate = gateAssignment.getArrivalGate() == null || 
				gateAssignment.getArrivalGate().isEmpty() ? "XXXXX" : gateAssignment.getArrivalGate();
		transformedGateAssignment.append(gate)
		.append(SEPARATOR);		
	}
	private static void transformRequestTag(StringBuffer transformedGateAssignment,GateAssignment gateAssignment) throws ParseException{
		transformedGateAssignment.append("SI Request_ID=");
		transformedGateAssignment.append(gateAssignment.getEventInfo().getRequestId())
		.append(SEPARATOR);		
	}
	private static void transformEventTag(StringBuffer transformedGateAssignment,GateAssignment gateAssignment) throws ParseException{
		transformedGateAssignment.append("SI Event_ID=");
		transformedGateAssignment.append(gateAssignment.getEventInfo().getEventId())
		.append(SEPARATOR);		
	}
	
	public static String transformDateFormatUppercase(String inputFormat,String outputFormat,String date) throws ParseException{
		if(inputFormat == null || inputFormat.isEmpty() || 
				outputFormat == null || outputFormat.isEmpty() ||
						date == null || date.isEmpty()){
			throw new IllegalArgumentException();
		}
		SimpleDateFormat inputDateFormat = new SimpleDateFormat(inputFormat);
		SimpleDateFormat outDateFormat = new SimpleDateFormat(outputFormat);
		return outDateFormat.format(inputDateFormat.parse(date)).toUpperCase();
	}
}
