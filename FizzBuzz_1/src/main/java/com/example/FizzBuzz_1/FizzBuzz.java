package com.example.FizzBuzz_1;

public class FizzBuzz {

	public String play(int i) {
		if (i % 3 == 0 && i % 5 == 0) {
			return "FizzBuzz";
		} else if (i % 3 == 0) {
			return "Fizz";
		} else if (i % 5 == 0) {
			return "Buzz";
		}
		return String.valueOf(i);
	}

}
