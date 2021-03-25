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
		try{
			validate(numberToMap, toType);
		}catch (Exception e){
			return e.getMessage();
		}

		return doMapping(numberToMap, toType);
	}

	private void validate(int numberToMap, String toType) throws Exception{
		if (validateToType(toType)) {
			throw new Exception(ERRORCODE.UNKNOWN_TARGET.toString());
		}
		if (isNegative(numberToMap)) {
			throw new Exception(ERRORCODE.NEGATIVE_NUMBER.toString());
		}
	}

	private String doMapping(int numberToMap, String toType){
		if (toType.equalsIgnoreCase(roman)) {
			RomanNumberMapper romanNumberMapper = new RomanNumberMapper();
			return romanNumberMapper.mapTo(numberToMap);
		}
		if (toType.equals(binary)) {
			return mapToBinary(numberToMap);
		}
		if ((toType.equalsIgnoreCase(octal))) {
			return mapToOctal(numberToMap);
		}
		if (toType.equals(hexadecimal)) {
			HexaDecimalMapper hexaDecimalMapper = new HexaDecimalMapper();
			return hexaDecimalMapper.mapTo(numberToMap);
		}
		return ERRORCODE.UNEXPECTED_ERROR.toString();
	}

	private String mapToBinary(int numberToMap) {
		BinaryMapper binaryMapper = new BinaryMapper();
		return binaryMapper.mapTo(numberToMap);
	}

	private String mapToOctal(int numberToMap) {
		OctalMapper octalMapper = new OctalMapper();
		return octalMapper.mapTo(numberToMap);
	}

	private boolean isNegative(int numberToMap) {
		return numberToMap < 0;
	}

	private boolean validateToType(String toType) {
		return !toType.equals(roman) && !toType.equals(binary) && !toType.equals(octal)
		&& !toType.equals(hexadecimal);
	}


}