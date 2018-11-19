package com.vidhyac.sample;

import java.util.Scanner;

public class ArmstrongMain {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=in.nextInt();
		
		Armstrong armstrong=new Armstrong();
		armstrong.ArmCalc(num);

	}

}
