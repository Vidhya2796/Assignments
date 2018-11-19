package com.vidhyac.sample;

import java.util.Scanner;

public class StudentMarksMain {
	
	public static void getMarks(){
		
		int S1[]=new int[3];
		int S2[]=new int[3];
		int S3[]=new int[3];
		
		/*
		int A[]=new int[3];
		int B[]=new int[3];
		int C[]=new int[3];
		*/
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{		int j=i;
				System.out.println("Enter 3 marks for Student "+(i+1)+" :");
				if(j==0){
					for(int a=0;a<3;a++){
						S1[a]=scanner.nextInt();
						//System.out.println("The mark "+(a+1)+" of Student 1 is "+S1[a]);
					}
						
				}
				else if(j==1){
					for(int b=0;b<3;b++){
						S2[b]=scanner.nextInt();
						//System.out.println("The mark "+(b+1)+" of Student 2 is "+S1[b]);
					}
				}
				else if(j==2){
					for(int c=0;c<3;c++){
						S3[c]=scanner.nextInt();
						//System.out.println("The mark "+(c+1)+" of Student  is "+S1[c]);
					}
					
				}
		}
		
		//displaying marks of the each student
		
		for(int x=0;x<3;x++){
			int y=x,sum=0;
			float avg=0.0f;
			System.out.println("3 marks of Student "+(x+1)+" is ");
			if(y==0){
				for(int a=0;a<3;a++){
					System.out.println(S1[a]);
					sum=sum+S1[a];
				}
				avg=sum/3.0f;
			
				System.out.println("The Total Marks Scored by Student1 is "+sum);
				System.out.println("The Average Mark Scored Scored by Student1 is "+avg);
				
			}
	
				
			else if(y==1){
				sum=0;
				avg=0.0f;
				for(int b=0;b<3;b++){
					System.out.println(S2[b]);
					sum=sum+S2[b];
				}
				avg=sum/3.0f;
				
				System.out.println("The Total Marks Scored by Student2 is "+sum);
				System.out.println("The Average Mark Scored by Student2 is "+avg);
			}

			else if(y==2){
				sum=0;
				avg=0.0f;
				for(int c=0;c<3;c++){
					System.out.println(S3[c]);
					sum=sum+S3[c];
				}
				avg=sum/3.0f;
				
				System.out.println("The Total Marks Scored by Student3 is "+sum);
				System.out.println("The Average Mark Scored by Student3 is "+avg);
			}
				
		}
		
		
			
		
	}
	public static void main(String[] args) {
		//StudentMarks studentMarks=new StudentMarks();
		
		//studentMarks.studentCalc(m1,m2,m3);
		getMarks();

	}

}
