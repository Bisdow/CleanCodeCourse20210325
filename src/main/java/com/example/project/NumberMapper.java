package com.example.project;
public class NumberMapper {

	public final static String roman = "Roman";
	public final static String binary = "Binary";
	public final static String octal = "Octal";
	public final static String hexadecimal = "Hexadecimal";


	public static void main(String[] args) {
		NumberMapper mapper = new NumberMapper();
		System.out.println(mapper.mapTo(Integer.parseInt(args[0]), args[1]));
	}

	public String mapTo(int numberToMap, String toType) {
		if (validateToType(toType)) {
			return ERRORCODE.UNKNOWN_TARGET.toString();
		}
		if (isNegative(numberToMap)) {
			return ERRORCODE.NEGATIVE_NUMBER.toString();
		}

		if (toType.equalsIgnoreCase(roman)) {
			return mapToRomanNumber(numberToMap);
		}
		if (toType.equals(binary)) {
			return mapToBinary(numberToMap);
		}
		if ((toType.equalsIgnoreCase(octal))) {
			return mapToOctal(numberToMap);
		}
		if (toType.equals(hexadecimal)) {
			return mapToHexaDecimal(numberToMap);
		}

		return ERRORCODE.UNEXPECTED_ERROR.toString();
	}

	private String mapToBinary(int numberToMap) {
		return mapToBase(numberToMap, 2);
	}

	private String mapToOctal(int numberToMap) {
		return mapToBase(numberToMap, 8);
	}

	private boolean isNegative(int numberToMap) {
		return numberToMap < 0;
	}

	private boolean validateToType(String toType) {
		return !toType.equals(roman) && !toType.equals(binary) && !toType.equals(octal)
		&& !toType.equals(hexadecimal);
	}

	// maps an integer into a String in the Roman numberToMap format
	private String mapToRomanNumber(int numberToMap) {
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

	// maps an integer into a String in any numberToMap format with the base provided
	private String mapToBase(int numberToMap, int base) {
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

	// maps an integer input into a String in the Hexadecimal numbersystem
	private String mapToHexaDecimal(int numberToMap) {
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