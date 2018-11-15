package com.vidhyac.sample;

import java.util.Scanner;

public class Marks {
	String result="";
	public void MarkCalc(int m1,int m2,int m3){
		
		if(m1 >60 && m2 >60 && m3 >60){
			result="Passed";
		}
		else if(m1>60 && m2>60 || m2>60 && m3>60 || m3>60 && m1>60){
			result="Promoted";
		}
		else if((m1>60 || (m2<60 && m3<60)) || (m2>60 || (m3<60 && m1<60)) || (m3>60 || (m1<60 && m2<60))){
			result="Failed";
		}
		System.out.println("The Result is "+result);	
		}
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the three subject marks: ");
		int m1=scanner.nextInt();
		int m2=scanner.nextInt();
		int m3=scanner.nextInt();
		
		Marks marks=new Marks();
		
		marks.MarkCalc(m1,m2,m3);
		
		
		
	}
}
