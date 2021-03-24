package com.example.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("AcceptanceTest => Map Integer to Romanian numbers")
class AcceptanceRomanianNumberTest {
	private NumberMapper underTest;

	private void executeTest(int input, String expected) {
		String actual = underTest.mapTo(input, "Romanian");
		String errorMessage = input + " should be " + expected + " but was " + actual;
		assertEquals(expected, actual, errorMessage);
	}

	@BeforeEach
	void beforeEach() {
		underTest = new NumberMapper();
	}

	@Test
	void zero() {
		executeTest(0, "");
	}

	@Test
	void oneToTwenty() {
		executeTest(1, "I");
		executeTest(2, "II");
		executeTest(3, "III");
		executeTest(4, "IV");
		executeTest(5, "V");
		executeTest(6, "VI");
		executeTest(7, "VII");
		executeTest(8, "VIII");
		executeTest(9, "IX");
		executeTest(10, "X");
		executeTest(11, "XI");
		executeTest(12, "XII");
		executeTest(13, "XIII");
		executeTest(14, "XIV");
		executeTest(15, "XV");
		executeTest(16, "XVI");
		executeTest(17, "XVII");
		executeTest(18, "XVIII");
		executeTest(19, "XIX");
		executeTest(20, "XX");
	}

	@Test
	void around50() {
		executeTest(39, "XXXIX");
		executeTest(40, "XL");
		executeTest(41, "XLI");
		executeTest(42, "XLII");
		executeTest(43, "XLIII");
		executeTest(44, "XLIV");
		executeTest(45, "XLV");
		executeTest(46, "XLVI");
		executeTest(47, "XLVII");
		executeTest(48, "XLVIII");
		executeTest(49, "IL");
		executeTest(50, "L");
		executeTest(51, "LI");
		executeTest(52, "LII");
		executeTest(53, "LIII");
		executeTest(54, "LIV");
		executeTest(55, "LV");
		executeTest(56, "LVI");
		executeTest(57, "LVII");
		executeTest(58, "LVIII");
		executeTest(59, "LIX");
		executeTest(60, "LX");
		executeTest(61, "LXI");
	}

	@Test
	void around100() {
		executeTest(89, "LXXXIX");
		executeTest(90, "XC");
		executeTest(91, "XCI");
		executeTest(92, "XCII");
		executeTest(93, "XCIII");
		executeTest(94, "XCIV");
		executeTest(95, "XCV");
		executeTest(96, "XCVI");
		executeTest(97, "XCVII");
		executeTest(98, "XCVIII");
		executeTest(99, "IC");
		executeTest(100, "C");
		executeTest(101, "CI");
		executeTest(102, "CII");
		executeTest(103, "CIII");
		executeTest(104, "CIV");
		executeTest(105, "CV");
		executeTest(106, "CVI");
		executeTest(107, "CVII");
		executeTest(108, "CVIII");
		executeTest(109, "CIX");
		executeTest(110, "CX");
		executeTest(111, "CXI");
	}

	@Test
	void around400() {
		executeTest(398, "CCCXCVIII");
		executeTest(399, "CCCIC");
		executeTest(400, "CD");
		executeTest(401, "CDI");
		executeTest(402, "CDII");
	}

	@Test
	void around500() {
		executeTest(489, "CDLXXXIX");
		executeTest(490, "XD");
		executeTest(491, "XDI");
		executeTest(492, "XDII");
		executeTest(493, "XDIII");
		executeTest(494, "XDIV");
		executeTest(495, "XDV");
		executeTest(496, "XDVI");
		executeTest(497, "XDVII");
		executeTest(498, "XDVIII");
		executeTest(499, "ID");
		executeTest(500, "D");
		executeTest(501, "DI");
		executeTest(502, "DII");
		executeTest(503, "DIII");
		executeTest(504, "DIV");
		executeTest(505, "DV");
		executeTest(506, "DVI");
		executeTest(507, "DVII");
		executeTest(508, "DVIII");
		executeTest(509, "DIX");
		executeTest(510, "DX");
		executeTest(511, "DXI");
	}

	@Test
	void around900() {
		executeTest(898, "DCCCXCVIII");
		executeTest(899, "DCCCIC");
		executeTest(900, "CM");
		executeTest(901, "CMI");
		executeTest(902, "CMII");
	}

	@Test
	void around1000() {
		executeTest(989, "CMLXXXIX");
		executeTest(990, "XM");
		executeTest(991, "XMI");
		executeTest(992, "XMII");
		executeTest(993, "XMIII");
		executeTest(994, "XMIV");
		executeTest(995, "XMV");
		executeTest(996, "XMVI");
		executeTest(997, "XMVII");
		executeTest(998, "XMVIII");
		executeTest(999, "IM");
		executeTest(1000, "M");
		executeTest(1001, "MI");
		executeTest(1002, "MII");
		executeTest(1003, "MIII");
		executeTest(1004, "MIV");
		executeTest(1005, "MV");
		executeTest(1006, "MVI");
		executeTest(1007, "MVII");
		executeTest(1008, "MVIII");
		executeTest(1009, "MIX");
		executeTest(1010, "MX");
		executeTest(1011, "MXI");
	}

	@Test
	void substractionRule() {
		executeTest(4, "IV");
		executeTest(9, "IX");
		executeTest(40, "XL");
		executeTest(49, "IL");
		executeTest(90, "XC");
		executeTest(99, "IC");
		executeTest(400, "CD");
		executeTest(490, "XD");
		executeTest(499, "ID");
		executeTest(900, "CM");
		executeTest(990, "XM");
		executeTest(999, "IM");
	}

	@Test
	void yearNumbers() {
		executeTest(1984, "MCMLXXXIV");
		executeTest(2019, "MMXIX");
	}
}
