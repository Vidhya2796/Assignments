package com.vidhyac.sample;

import java.util.Scanner;

public class Array {
	//int arr[]=new arr[15];
	int[] arr={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	
	public void sortArray(int number) {
		
		for(int i=0;i<arr.length;i++){
			if (arr[i]== number){
				System.out.println(number+" is found");
				break;
			}
			if (i==arr.length-1)
				System.out.println(number+" is not found");
			
		}
		//if(count>0)
		//System.out.println(number+" is not found");	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number to search: ");
		int number=scanner.nextInt();
		
		Array array=new Array();
		array.sortArray(number);
	}

}
