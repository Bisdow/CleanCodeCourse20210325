package com.example.project;

public class MapToBase {

    	// maps an integer into a String in any numberToMap format with the base provided
	public String mapToBase(int numberToMap, int base) {
		String result = "";

		int counter = 0;
		int rest = numberToMap;

		// Handle Zero value
		if (numberToMap == 0) {
			return "0";
		}

		// calculaten needed counter
		while (rest > 0) {
			rest = rest / base;
			counter++;
		}
		counter--;

		// create Result
		for (; counter >= 0; counter--) {
			result = Integer.toString(numberToMap % base).concat(result);
			numberToMap = numberToMap / base;
		}
		return result;
	}

}