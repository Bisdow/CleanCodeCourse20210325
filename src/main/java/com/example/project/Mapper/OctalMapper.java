package com.example.project.Mapper;


public class OctalMapper extends MapToBase {

    public String mapTo(int numberToMap) {
        return mapToBase(numberToMap, 8);
    }

}