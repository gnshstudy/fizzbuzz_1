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

	@Test
	public void testFizz() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String returnedNumber = fizzBuzz.play(6);
		assertEquals("Fizz", returnedNumber);
	}
	@Test
	public void testBuzz() throws Exception {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String returnedNumber = fizzBuzz.play(5);
		assertEquals("Buzz", returnedNumber);
	}
	
	@Test
	public void testFizzBuzz() throws Exception {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String returnedNumber = fizzBuzz.play(15);
		assertEquals("FizzBuzz", returnedNumber);
	}
}
