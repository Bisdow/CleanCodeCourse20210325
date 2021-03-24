package com.example.project;

public class NumberMapper {
	public static void main(String[] args) {
		NumberMapper mapper = new NumberMapper();
		// if( args[0] < 0){
		// return;
		// }
		System.out.println(mapper.mapTo(Integer.parseInt(args[0]), args[1]));
	}

	/*
	 * The current number that should be mapped
	 */
	int number;
	/*
	 * The result for the mapped number
	 */
	String result;

	public String mapTo(int input, String toType) {
		if (!toType.equals("Romanian") && !toType.equals("Binary") && !toType.equals("Octal")
				&& !toType.equals("Hexadecimal")) {
			return ERRORCODE.UNKNOWN_TARGET.toString();
		}
		if (input < 0) {
			return ERRORCODE.NEGATIVE_NUMBER.toString();
		}
		if (toType.equalsIgnoreCase("Romanian")) {
			return mapToRomanianNumber(input);
		}
		if (toType.equals("Binary")) {
			return mapToBase(input, 2);
		}
		if ((toType.equalsIgnoreCase("Octal"))) {
			return mapToBase(input, 8);
		}
		if (toType.equals("Hexadecimal")) {
			return mapToHexaDecimal(input);
		}
		return ERRORCODE.UNEXPECTED_ERROR.toString();
	}

	// maps an integer into a String in the Romaniam number format
	String mapToRomanianNumber(int input) {
		// TODO: Consistency check
		number = input;
		result = "";

		// Handle Zero Value
		if (input == 0) {
			return result;
		}

		while (number > 0) {
			if (number >= 1000) {
				result = result.concat("M");
				number -= 1000;
			} else if (number >= 999) {
				result = result.concat("IM");
				number -= 999;
			} else if (number >= 990) {
				result = result.concat("XM");
				number -= 990;
			} else if (number >= 900) {
				result = result.concat("CM");
				number -= 900;
			} else if (number >= 500) {
				result = result.concat("D");
				number -= 500;
			} else if (number >= 499) {
				result = result.concat("ID");
				number -= 499;
			} else if (number >= 490) {
				result = result.concat("XD");
				number -= 490;
			} else if (number >= 400) {
				result = result.concat("CD");
				number -= 400;
			} else if (number >= 100) {
				result = result.concat("C");
				number -= 100;
			} else if (number >= 99) {
				result = result.concat("IC");
				number -= 99;
			} else if (number >= 90) {
				result = result.concat("XC");
				number -= 90;
			} else if (number >= 50) {
				result = result.concat("L");
				number -= 50;
			} else if (number >= 49) {
				result = result.concat("IL");
				number -= 49;
			} else if (number >= 40) {
				result = result.concat("XL");
				number -= 40;
			} else if (number >= 10) {
				result = result.concat("X");
				number -= 10;
			} else if (number >= 9) {
				result = result.concat("IX");
				number -= 9;
			} else if (number >= 5) {
				result = result.concat("V");
				number -= 5;
			} else if (number >= 4) {
				result = result.concat("IV");
				number -= 4;
			} else if (number >= 1) {
				result = result.concat("I");
				number--;
			}
		}
		return result;
	}

	// maps an integer into a String in any number format with the base provided
	String mapToBase(int input, int base) {
		number = input;
		result = "";

		int counter = 0;
		int rest = input;

		// Handle Zero value
		if (input == 0) {
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
			result = Integer.toString(number % base).concat(result);
			number = number / base;
		}
		return result;
	}

	// maps an integer input into a String in the Hexadecimal numbersystem
	String mapToHexaDecimal(int input) {
		// Handle Zero value
		if (input == 0) {
			return "0";
		}

		number = input;
		result = "";

		int counter = 0;
		int rest = input;

		// calculaten needed counter
		while (rest > 0) {
			rest = rest / 16;
			counter++;
		}
		counter--;

		// create Result
		for (; counter >= 0; counter--) {
			int helperValue = number % 16;
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
			number = number / 16;
		}
		return result;
	}
}