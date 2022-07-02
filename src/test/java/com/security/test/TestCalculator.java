package com.security.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.security.service.Calculator;

class TestCalculator {

	@Test
	public void additionTest()
	{
		Calculator cals = new Calculator();
		assertEquals(30, cals.addition(10, 20));
	}
	
	@Test
	public void subtractionTest()
	{
		Calculator cals = new Calculator();
		assertEquals(80, cals.subtraction(100, 20));
	}
	
	@Test
	public void multiplytest()
	{
		Calculator cals = new Calculator();
		assertEquals(200, cals.multiply(10, 20));
	}
	
	@Test
	public void divideTest()
	{
		Calculator cals = new Calculator();
		assertEquals(5, cals.division(100, 20));
	}

}
