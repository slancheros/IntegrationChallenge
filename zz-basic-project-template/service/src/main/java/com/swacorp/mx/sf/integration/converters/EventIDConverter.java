package com.swacorp.mx.sf.integration.converters;

public class EventIDConverter extends IntegrationLayerConverter {

	@Override
	protected Object transformation(Object existingDestinationFieldValue, Object sourceFieldValue) {
		return (String) existingDestinationFieldValue+"SI Event_ID="+(String) sourceFieldValue+"&#xA;\n";
	}

}
