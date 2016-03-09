package com.swacorp.mx.sf.integration.converters;

import org.dozer.CustomConverter;

public abstract class IntegrationLayerConverter  implements CustomConverter {

	protected boolean validateNull = true;
	
	@Override
	public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass,
			Class<?> sourceClass) {
		if (validateNull && sourceFieldValue == null) {
			return existingDestinationFieldValue;
		}
		return transformation(existingDestinationFieldValue,sourceFieldValue);
	}
	
	
	
	protected abstract Object transformation(Object existingDestinationFieldValue, Object sourceFieldValue);

}
