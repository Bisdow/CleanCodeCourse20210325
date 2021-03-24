package com.example.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("AcceptanceTest => Map Integer to Octal")
class AcceptanceOctalTest {
	private NumberMapper underTest;

	private void executeTest(int input, String expected) {
		String actual = underTest.mapTo(input, "Octal");
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
		executeTest(2, "2");
		executeTest(3, "3");
		executeTest(4, "4");
		executeTest(5, "5");
		executeTest(6, "6");
		executeTest(7, "7");
		executeTest(8, "10");
		executeTest(9, "11");
		executeTest(10, "12");
		executeTest(11, "13");
		executeTest(12, "14");
		executeTest(13, "15");
		executeTest(14, "16");
		executeTest(15, "17");
		executeTest(16, "20");
	}

	@Test
	void seventeenTo32() {
		executeTest(17, "21");
		executeTest(18, "22");
		executeTest(19, "23");
		executeTest(20, "24");
		executeTest(21, "25");
		executeTest(22, "26");
		executeTest(23, "27");
		executeTest(24, "30");
		executeTest(25, "31");
		executeTest(26, "32");
		executeTest(27, "33");
		executeTest(28, "34");
		executeTest(29, "35");
		executeTest(30, "36");
		executeTest(31, "37");
		executeTest(32, "40");
	}
}
