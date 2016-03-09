package com.swacorp.mx.sf.integration.converters;

public class RequestIDConverter extends IntegrationLayerConverter {

	@Override
	protected Object transformation(Object existingDestinationFieldValue, Object sourceFieldValue) {
		return (String) existingDestinationFieldValue+"SI Request_ID="+(String) sourceFieldValue+"&#xA;";
	}

}
