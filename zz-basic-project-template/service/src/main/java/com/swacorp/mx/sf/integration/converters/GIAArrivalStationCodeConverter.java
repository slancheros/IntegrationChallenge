package com.swacorp.mx.sf.integration.converters;

public class GIAArrivalStationCodeConverter extends IntegrationLayerConverter {

	@Override
	protected Object transformation(Object existingDestinationFieldValue, Object sourceFieldValue) {
		return (String) existingDestinationFieldValue+(String) sourceFieldValue+"&#xA;";
	}

}
