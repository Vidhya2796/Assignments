package com.capgemini;

public class Calculator {
	int number1, number2, result;

	void add(int number1, int number2) {
		result = number1 + number2;
		System.out.println(result);
	}

	void sub(int number1, int number2) {
		result = number1 - number2;
		System.out.println(result);
	}

	void div(int number1, int number2) {
		result = number1 / number2;
		System.out.println(result);
	}

	void mul(int number1, int number2) {
		result = number1 * number2;
		System.out.println(result);
	}
}
