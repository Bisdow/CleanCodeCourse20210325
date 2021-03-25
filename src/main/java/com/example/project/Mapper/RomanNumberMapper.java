package com.example.project.Mapper;

public class RomanNumberMapper implements Mapable {
    	// maps an integer into a String in the Roman numberToMap format
	public String mapTo(int numberToMap) {
		String result = "";

		if (numberToMap == 0) {
			return result;
		}

		while (numberToMap > 0) {
			if (numberToMap >= 1000) {
				result = result.concat("M");
				numberToMap -= 1000;
			} else if (numberToMap >= 999) {
				result = result.concat("IM");
				numberToMap -= 999;
			} else if (numberToMap >= 990) {
				result = result.concat("XM");
				numberToMap -= 990;
			} else if (numberToMap >= 900) {
				result = result.concat("CM");
				numberToMap -= 900;
			} else if (numberToMap >= 500) {
				result = result.concat("D");
				numberToMap -= 500;
			} else if (numberToMap >= 499) {
				result = result.concat("ID");
				numberToMap -= 499;
			} else if (numberToMap >= 490) {
				result = result.concat("XD");
				numberToMap -= 490;
			} else if (numberToMap >= 400) {
				result = result.concat("CD");
				numberToMap -= 400;
			} else if (numberToMap >= 100) {
				result = result.concat("C");
				numberToMap -= 100;
			} else if (numberToMap >= 99) {
				result = result.concat("IC");
				numberToMap -= 99;
			} else if (numberToMap >= 90) {
				result = result.concat("XC");
				numberToMap -= 90;
			} else if (numberToMap >= 50) {
				result = result.concat("L");
				numberToMap -= 50;
			} else if (numberToMap >= 49) {
				result = result.concat("IL");
				numberToMap -= 49;
			} else if (numberToMap >= 40) {
				result = result.concat("XL");
				numberToMap -= 40;
			} else if (numberToMap >= 10) {
				result = result.concat("X");
				numberToMap -= 10;
			} else if (numberToMap >= 9) {
				result = result.concat("IX");
				numberToMap -= 9;
			} else if (numberToMap >= 5) {
				result = result.concat("V");
				numberToMap -= 5;
			} else if (numberToMap >= 4) {
				result = result.concat("IV");
				numberToMap -= 4;
			} else if (numberToMap >= 1) {
				result = result.concat("I");
				numberToMap--;
			}
		}
		return result;
	}
}