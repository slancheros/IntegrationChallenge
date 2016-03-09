package com.swacorp.mx.sf.integration.converters;

public class GIATailConverter extends IntegrationLayerConverter {

	@Override
	protected Object transformation(Object existingDestinationFieldValue, Object sourceFieldValue) {
		return (String) existingDestinationFieldValue+(String) sourceFieldValue+".";
	}

}
