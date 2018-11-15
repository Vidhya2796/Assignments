package com.vidhyac.sample;

import java.util.Scanner;

public class SimpleCompound {
	double principal,simpleInterest=0.0d,compoundInterest=0.0d;
	float rateOfInterest=0.0f;
	int noOfYears;
	void Calc(){
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Principal");
		principal=scanner.nextDouble();
		
		System.out.println("Enter Rate of interest");
		rateOfInterest=scanner.nextFloat();
		
		System.out.println("Enter Number of Years");
		noOfYears=scanner.nextInt();
		
		//To find simple interest
		simpleInterest=(principal * noOfYears * rateOfInterest )/100;
		System.out.println("Simple Interest is "+simpleInterest );
		
		//To find simple interest
		compoundInterest=principal + Math.pow((1+(rateOfInterest /100)),rateOfInterest);
		System.out.println("compound Interest is "+compoundInterest );
				
	}
	
	
	public static void main(String[] args) {
		SimpleCompound simpleCompound =new SimpleCompound();
		simpleCompound.Calc();
		
	}

}
