package com.verizon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSum() {
		Calculator s=new Calculator();
		assertEquals(7,s.sum(3, 4));
		//fail("Not yet implemented");
	}

	@Test
	void testDiff() {
		Calculator s=new Calculator();
		assertEquals(3,s.diff(5,2));
	}

	@Test
	void testProduct() {
		Calculator s=new Calculator();
		assertEquals(25,s.product(5, 5));
	}

	@Test
	void testDiv() {
		Calculator s=new Calculator();
		assertEquals(5,s.div(15,3));
		//fail("Not yet implemented");
	}

}
