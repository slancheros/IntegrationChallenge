package com.swacorp.mx.sf.integration.converters;

import java.text.ParseException;

import org.dozer.MappingException;

import com.swacorp.mx.sf.integration.utils.IntegrationLayerTransformationUtils;

public class GIADateConverter extends IntegrationLayerConverter {

	@Override
	protected Object transformation(Object existingDestinationFieldValue, Object sourceFieldValue) {
		try {
			return (String) existingDestinationFieldValue+
					IntegrationLayerTransformationUtils.
					transformDateFormatUppercase("yyyyMMdd", "ddMMMyyyy", 
							(String) sourceFieldValue)+".";
		} catch (ParseException e) {
			throw new MappingException(e);
		}
	}

}
