package com.vidhyac.sample;

public class Armstrong {
	int number1;
	int number,digit,cube=1;
	int sum=0;
	
	void ArmCalc(int num1){
		this.number=num1;
		number1 =number ;
		//System.out.println(number);
		while(number!=0){
			digit=number%10;
			cube=digit*digit*digit;
			sum=sum+cube;
			number=number/10;	
		}
		//System.out.println(number);
		if(number1 == sum)	
			System.out.println(number1+" is an armstrong number");
		else
			System.out.println(number1+" is not an armstrong number");
		}
	
	}
