package com.vidhyac.sample;

public class Employee {
	int eid;
	String ename;
	int eage;
	
	Employee()
	{
		
		eid=2796;
		ename="Vidhya";
		eage=22;
	}
	
	Employee(int eid,String ename,int eage)
	{
		this.eid=eid;
		this.ename=ename;
		this.eage=eage;
	}
	
	void printEmployeeDetails()
	{
		System.out.println("Your id is "+eid);
		System.out.println("Your name is "+ename);
		System.out.println("Your age is "+eage);
	}

}
