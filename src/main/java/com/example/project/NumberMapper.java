package com.example.project;

import com.example.project.Mapper.Mapable;
import com.example.project.Mapper.NumberMapperFactory;

public class NumberMapper {
	public String mapTo(int numberToMap, String toType) {
		try{
			validate(numberToMap, toType);
			Mapable mapable = NumberMapperFactory.create(toType);
			return mapable.mapTo(numberToMap);
		}catch (Exception e){
			return e.getMessage();
		}
	}

	private void validate(int numberToMap, String toType) throws Exception{
		if (isNegative(numberToMap)) {
			throw new Exception(ERRORCODE.NEGATIVE_NUMBER.toString());
		}
	}

	private boolean isNegative(int numberToMap) {
		return numberToMap < 0;
	}
}