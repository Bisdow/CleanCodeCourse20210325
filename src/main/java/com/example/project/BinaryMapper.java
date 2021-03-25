package com.example.project;

public class BinaryMapper extends MapToBase { 
    public String mapTo(int numberToMap) {
		return mapToBase(numberToMap, 2);
    }
}