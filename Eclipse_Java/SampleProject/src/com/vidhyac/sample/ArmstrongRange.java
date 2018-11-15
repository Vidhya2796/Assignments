package com.vidhyac.sample;

public class ArmstrongRange {

	int number, digit, cube = 1, sum = 0, i;

	void ArmCalc() {
		System.out.println("The Armstrong Number Ranges From 100 to 999 :");
		// System.out.println(number);
		for (i = 100; i <= 999; i++) {
			number = i;
			sum = 0;
			while (number != 0) {
				digit = number % 10;
				cube = digit * digit * digit;
				sum = sum + cube;
				number = number / 10;
			}

			if (i == sum) {
				System.out.println(i);
			}
		}
	}
}
