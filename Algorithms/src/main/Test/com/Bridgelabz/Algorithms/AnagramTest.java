package com.Bridgelabz.Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

	@Test
	void test() {
		
		assertEquals(true,Anagram.checkAnagram("pool","polo"));
	}

}