package com.example.project;

public class HexaDecimalMapper {

    // maps an integer input into a String in the Hexadecimal numbersystem
	public String mapTo(int numberToMap) {
		// Handle Zero value
		if (numberToMap == 0) {
			return "0";
		}

		String result = "";

		int counter = 0;
		int rest = numberToMap;

		// calculaten needed counter
		while (rest > 0) {
			rest = rest / 16;
			counter++;
		}
		counter--;

		// create Result
		for (; counter >= 0; counter--) {
			int helperValue = numberToMap % 16;
			// Special Handling for 10 to 15
			if (helperValue == 10) {
				result = result.concat("A");
			} else if (helperValue == 11) {
				result = result.concat("B");
			} else if (helperValue == 12) {
				result = result.concat("C");
			} else if (helperValue == 13) {
				result = result.concat("D");
			} else if (helperValue == 14) {
				result = result.concat("E");
			} else if (helperValue == 15) {
				result = result.concat("F");
			} else {
				result = Integer.toString(helperValue).concat(result);
			}
			numberToMap = numberToMap / 16;
		}
		return result;
	}

}