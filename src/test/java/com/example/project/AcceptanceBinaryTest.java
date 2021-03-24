package com.example.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("AcceptanceTest => Map Integer to Binary")
class AcceptanceBinaryTest {
	private NumberMapper underTest;

	private void executeTest(int input, String expected) {
		String actual = underTest.mapTo(input, "Binary");
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
	void oneToSixteen() {
		executeTest(1, "1");
		executeTest(2, "10");
		executeTest(3, "11");
		executeTest(4, "100");
		executeTest(5, "101");
		executeTest(6, "110");
		executeTest(7, "111");
		executeTest(8, "1000");
		executeTest(9, "1001");
		executeTest(10, "1010");
		executeTest(11, "1011");
		executeTest(12, "1100");
		executeTest(13, "1101");
		executeTest(14, "1110");
		executeTest(15, "1111");
		executeTest(16, "10000");
	}

	@Test
	void seventeenTo32() {
		executeTest(17, "10001");
		executeTest(18, "10010");
		executeTest(19, "10011");
		executeTest(20, "10100");
		executeTest(21, "10101");
		executeTest(22, "10110");
		executeTest(23, "10111");
		executeTest(24, "11000");
		executeTest(25, "11001");
		executeTest(26, "11010");
		executeTest(27, "11011");
		executeTest(28, "11100");
		executeTest(29, "11101");
		executeTest(30, "11110");
		executeTest(31, "11111");
		executeTest(32, "100000");
	}
}
