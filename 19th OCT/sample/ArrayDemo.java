package com.vidhyac.sample;

import java.util.Scanner;

public class ArrayDemo {

		int numbers[]=new int[5];
		
		//Getting array values from user
		void getValues(){
			System.out.println("Getting the values from the user: ");
			Scanner scanner=new Scanner(System.in);
			for(int i=0;i<5;i++){
				System.out.println("Enter value "+(i+1)+":");
				numbers[i]=scanner.nextInt();
			}
		}
		//Displaying array values in the console
		void displayValues(){
			System.out.println("Displaying Values: ");
			for(int i=0;i<5;i++){
				System.out.println("Number "+(i+1)+" is "+numbers[i]);
			}
		}
		
		//show
		void show(){
			for(int i=0;i<5;i++)
			System.out.println(numbers[i]);
		}
		
		//Ascending order
		void ascendingValues(){
			System.out.println("Ascending order: ");
			int temp;
			for(int i=0;i<5;i++){
				for(int j=i+1;j<5;j++){
					if (numbers[i]>numbers[j]){
						temp=numbers[i];
						numbers[i]=numbers[j];
						numbers[j]=temp;
					}
				}
			}
			show();
		}
		
			//Descending order
		void descendingValues(){
		
			System.out.println("Descending order: ");
			int temp1;
			
			for(int a=0;a<5;a++){
				for(int j=a+1;j<5;j++){
					if (numbers[a]<numbers[j]){
						temp1=numbers[a];
						numbers[a]=numbers[j];
						numbers[j]=temp1;
					}
				}
			}
			show();
		}
		
		void bigValue(){
			
			int big=numbers[0];
			for(int i=1;i<numbers.length;i++){
				if (numbers[i]>big)
					big=numbers[i];
			}
			System.out.println("Biggest is "+big);
		}
		
		void smallValue(){
			int small=numbers[0];
			for(int i=1;i<numbers.length;i++){
				if (numbers[i]<small)
					small=numbers[i];
			}
			System.out.println("Smallest is "+small);
		}
		
		void sizeOfArray(){
			System.out.println("Size of the array is "+numbers.length);
		}
			
		
		
		}

