package com.example.project.Mapper;

public class NumberMapperFactory {
	public final static String roman = "Roman";
	public final static String binary = "Binary";
	public final static String octal = "Octal";
	public final static String hexadecimal = "Hexadecimal";

	public final static String UNKNOWN_TARGET = "Unknown Type to convert to";

    public static Mapable create(String toType) throws Exception {
        if (toType.equalsIgnoreCase(roman)) {
			return new RomanNumberMapper();
		} else if (toType.equals(binary)) {
			return new BinaryMapper();
		} else if ((toType.equalsIgnoreCase(octal))) {
			return new OctalMapper();
		} else if (toType.equals(hexadecimal)) {
			return new HexaDecimalMapper();
		} else {
            throw new Exception(UNKNOWN_TARGET);
        }
    }

}
