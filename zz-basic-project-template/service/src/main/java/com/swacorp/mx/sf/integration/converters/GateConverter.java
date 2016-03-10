package com.swacorp.mx.sf.integration.converters;

public class GateConverter extends IntegrationLayerConverter {
	
	public GateConverter() {
		super();
		setValidateNull(false);
	}
		
	@Override
	protected Object transformation(Object existingDestinationFieldValue, Object sourceFieldValue) {
			if (sourceFieldValue == null || ((String)sourceFieldValue).isEmpty()) {
				return existingDestinationFieldValue+"GTE XXXXX&#xA;";
			}			
			return (String) existingDestinationFieldValue+"GTE "+(String) sourceFieldValue
					+"&#xA;";
		}
	

}
