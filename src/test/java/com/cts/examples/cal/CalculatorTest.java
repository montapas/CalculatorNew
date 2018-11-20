package com.cts.examples.cal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.examples.cal.Calculator;
import com.cts.examples.cal.ICalculator;

public class CalculatorTest {
	private static ICalculator calculator;

	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}

 
	@Test
	public void testSum() {
		 int result = calculator.sum(3, 4);
		System.out.println(String.format("The value of my integer is %d", "Hello World"));  // Noncompliant; an 'int' is expected rather than a String)
		
             	assertEquals(7, result);
	}
       

	 

	@Ignore
	@Test
	public void testEqual() {
		boolean result = calculator.equalIntegers(20, 20);

		assertFalse(result);
	}

	 
	@Test
	public void testSubstraction() {
		int result = 10 - 3;

		assertTrue(result == 7);
	}
}
