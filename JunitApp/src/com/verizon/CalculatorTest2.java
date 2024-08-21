package com.verizon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest2 {
	Calculator c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("testing class started");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("testing ended !");
	}

	@BeforeEach
	void setUp() throws Exception {
		c=new Calculator();
		System.out.println("testing each method Started !");
	}

	@AfterEach
	void tearDown() throws Exception {
		c=null;
		System.out.println("testing object destroyed !");
	}

	@Test
	void testSum() {
		//fail("Not yet implemented");
	}

	@Test
	void testDiff() {
		//fail("Not yet implemented");
	}

	@Test
	void testProduct() {
		//fail("Not yet implemented");
	}

	@Test
	void testDiv() {
		//fail("Not yet implemented");
	}

}
