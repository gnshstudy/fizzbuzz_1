package com.example.FizzBuzz_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	
	@Test
	public void testNumber() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String result = fizzBuzz.play(1);
		assertEquals("1", result);
	}

}
