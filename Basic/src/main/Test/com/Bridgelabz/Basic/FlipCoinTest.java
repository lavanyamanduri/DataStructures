package com.Bridgelabz.Basic;


import org.junit.jupiter.api.Test;

class FlipCoinTest {

	@Test
	void test() {
		assertEquals(60.0,80.0,100.0,FlipCoin.flip(60.0),FlipCoin.flip(80.0),FlipCoin.flip(100.0));
	}

	private void assertEquals(double d, double e, double f, double flip, double flip2, double flip3) {
		// TODO Auto-generated method stub
		
	}

}
