package com.example.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("AcceptanceTest => General Error Handling")
class AcceptanceGeneralErrorHandlingTest {
	private NumberMapper underTest;

	@BeforeEach
	void beforeEach() {
		underTest = new NumberMapper();
	}

	@Test
	void callWithUnkownTarget() {
		String expected = ERRORCODE.UNKNOWN_TARGET.toString();

		String actual = underTest.mapTo(10, "UnknownTarget");
		assertEquals(expected, actual);
	}

	@Test
	void callWithMissingParams() {
		String expected = ERRORCODE.NEGATIVE_NUMBER.toString();

		String actual = underTest.mapTo(-1, "Romanian");
		assertEquals(expected, actual);
	}
}
