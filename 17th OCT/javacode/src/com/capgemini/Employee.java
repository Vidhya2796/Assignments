package com.capgemini;

public class Employee {
	int empid;
	String ename;
	int eage;
	
	//constructor
	Employee()
	{  
		//initializing values
		empid=1522;
		ename="Akash";
		eage=18;
	}
				//123,       "Vijay",     20
	Employee(int empid,String ename,int eage){
		this.empid=empid;
		this.ename=ename;
		this.eage=eage;
	}
	
	void Print()
	{
		System.out.println(empid);
		System.out.println(ename);
		System.out.println(eage);
	}
}
