package com.Bridgelabz.Junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() {
		assertEquals(99,Temperature.celsius(37.0));
	}

}
