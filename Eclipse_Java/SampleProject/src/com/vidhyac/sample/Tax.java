package com.vidhyac.sample;

import java.util.Scanner;

public class Tax {
	double tax=0.0d;
	
	public void calcTax(double salary){
		if(salary <= 180000)
			tax =0.0d;
		if(salary > 180000 && salary <= 300000)
			tax =salary * 0.10;
		if(salary > 300000 && salary <= 500000)
			tax =salary * 0.20;
		if(salary > 500000 && salary <= 1000000)
			tax =salary * 0.30;
		System.out.println("Your Tax amount is "+ Math.round(tax));

		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tax tax =new Tax();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter your CTC in lakhs: ");
		double salary=scanner.nextDouble();
		tax.calcTax(salary);
		

	}

}
