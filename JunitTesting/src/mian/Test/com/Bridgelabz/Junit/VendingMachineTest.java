package com.Bridgelabz.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VendingMachineTest {

	@Test
	void test() {
		assertEquals(3,VendingMachine.countCurrency(2015));
	}

}
