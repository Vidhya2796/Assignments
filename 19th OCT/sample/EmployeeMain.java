package com.vidhyac.sample;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {

		Employee e1=new Employee();
		e1.printEmployeeDetails();
		System.out.println("*****************************");
		
		Employee e2=new Employee(1234,"Leo",40);
		e2.printEmployeeDetails();
		System.out.println("*****************************");
		
		//read values from output
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Employee ID,Name and Age: ");

		int empid=sc.nextInt();
		String empname=sc.next();
		int empage=sc.nextInt();
	
		Employee e3=new Employee(empid,empname,empage);
		e3.printEmployeeDetails();
		
		
	}

}
