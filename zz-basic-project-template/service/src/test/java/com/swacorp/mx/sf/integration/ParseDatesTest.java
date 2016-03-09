package com.swacorp.mx.sf.integration;

import org.junit.Test;

import com.swacorp.mx.sf.integration.utils.IntegrationLayerTransformationUtils;

import static org.junit.Assert.*;

import java.text.ParseException;
public class ParseDatesTest {
	
	@Test
	public void testDateParsing() throws ParseException {
		String inputFormat = "yyyyMMdd";
		String outputFormat = "ddMMMyyyy";
		String date = "20150720";
		String result = IntegrationLayerTransformationUtils.transformDateFormatUppercase(inputFormat, outputFormat, date);
		assertEquals(result, "20JUL2015");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDateParsingArgumentError() throws ParseException {
		String inputFormat = "yyyyMMdd";
		String outputFormat = "";
		String date = "20150720";
		IntegrationLayerTransformationUtils.transformDateFormatUppercase(inputFormat, outputFormat, date);
	}
	
	
}
