package com.example.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("AcceptanceTest => Map Integer to Hexadecimal")
class AcceptanceHexadecimalTest {

	private NumberMapper underTest;

	private void executeTest(int input, String expected) {
		String actual = underTest.mapTo(input, "Hexadecimal");
		String errorMessage = input + " should be " + expected + " but was " + actual;
		assertEquals(expected, actual, errorMessage);
	}

	@BeforeEach
	void beforeEach() {
		underTest = new NumberMapper();
	}

	@Test
	void zero() {
		executeTest(0, "0");
	}

	@Test
	void oneTo16() {
		executeTest(0, "0");
		executeTest(1, "1");
		executeTest(2, "2");
		executeTest(3, "3");
		executeTest(4, "4");
		executeTest(5, "5");
		executeTest(6, "6");
		executeTest(7, "7");
		executeTest(8, "8");
		executeTest(9, "9");
		executeTest(10, "A");
		executeTest(11, "B");
		executeTest(12, "C");
		executeTest(13, "D");
		executeTest(14, "E");
		executeTest(15, "F");
		executeTest(16, "10");
	}

	@Test
	void seventeenTo32() {
		executeTest(17, "11");
		executeTest(18, "12");
		executeTest(19, "13");
		executeTest(20, "14");
		executeTest(21, "15");
		executeTest(22, "16");
		executeTest(23, "17");
		executeTest(24, "18");
		executeTest(25, "19");
		executeTest(26, "1A");
		executeTest(27, "1B");
		executeTest(28, "1C");
		executeTest(29, "1D");
		executeTest(30, "1E");
		executeTest(31, "1F");
		executeTest(32, "20");
	}
}
