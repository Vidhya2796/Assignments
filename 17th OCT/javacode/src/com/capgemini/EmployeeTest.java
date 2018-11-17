package com.capgemini;
import java.util.*;
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee();//default constructor
		e1.Print();

		System.out.println("################################");
		
		//read value from keyboard
		//Scanner class- Activity 1
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter your id,name and age");
		int eage1=ac.nextInt();
		String name=ac.nextLine();
		int eid1=ac.nextInt();
		
		Employee e3=new Employee(eid1,name,eage1);
		e3.Print();
		//constructor with argument
		
		
		
	}

}
