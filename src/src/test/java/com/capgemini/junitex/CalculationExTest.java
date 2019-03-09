package com.capgemini.junitex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculationExTest {
	
	static CalculationEx calculationEx;
	@BeforeAll
	public static void init() {
		calculationEx = new CalculationEx();
	}
	@Test
	void testAdd() {
		 
		//CalculationEx calculationEx = new CalculationEx();
		int actual = calculationEx.add(5, 4);
	 
		
		assertEquals(9, calculationEx.add(5, 4));
	}
	

	@Test
	void testSub() {
		
		assertEquals(1, calculationEx.sub(5, 4));
	}
	
	 
	@Test
	void testUpdateDb() {
		
		assertEquals(1, calculationEx.updateDb(15000, 1001));
	}
}
