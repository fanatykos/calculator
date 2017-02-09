package CalculateClass;

import static org.junit.Assert.*;

import org.junit.Test;

import calculateclass.Calculator;

public class TestCalculator {

	@Test
	public void testCalculateLackOfNumbers() {
		Calculator calc = new Calculator();
		String sentence = "";
		String resultExpected = "";

		assertTrue(calc.calculate(sentence).equals(resultExpected));
	}

	@Test
	public void testCalculateOneNumber() {
		Calculator calc = new Calculator();
		String sentence = "2*8+9:3";
		String resultExpected = "19.0";
		assertTrue(calc.calculate(sentence).equals(resultExpected));
	}
}
