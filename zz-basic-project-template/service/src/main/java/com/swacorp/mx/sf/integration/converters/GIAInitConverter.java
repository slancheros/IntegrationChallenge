package com.swacorp.mx.sf.integration.converters;

public class GIAInitConverter  extends IntegrationLayerConverter {

	@Override
	protected Object transformation(Object existingDestinationFieldValue, Object sourceFieldValue) {
		return "GIA&#xA;"+(String) sourceFieldValue;
	}

}
