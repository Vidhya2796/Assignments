package com.vidhyac.sample;

import java.util.Scanner;

public class BigSmallArray {
		
		//int number[]=new int[]{20,55,38,99,270,11,76};
		int number[]=new int[7];
		
		void get(){

			Scanner scanner=new Scanner(System.in);
			for(int i=0;i<7;i++){
				System.out.println("Enter value "+(i+1)+ ": ");
				number[i]=scanner.nextInt();
			}
			System.out.println();
		}
			
		void show(){
			for(int i=0;i<7;i++)
				System.out.println("The Value "+(i+1)+ " is "+number[i]);
			System.out.println();
		}
			
			
	
	
		void bigValue(){
			int big=number[0];
				for(int i=0;i<number.length;i++){
					if(number[i]>big)
						big=number[i];
				}
				System.out.println();
				System.out.println("Biggest is "+big);
		}
		
		void smallValue(){
			int small=number[0];
				for(int i=0;i<number.length;i++){
					if(number[i]<small)
						small=number[i];
				}
				System.out.println();
				System.out.println("Smallest is "+small);
		}
		
		void sizeOfArray(){
			System.out.println();
			System.out.println("Size is "+number.length);
		}
		
		
}
