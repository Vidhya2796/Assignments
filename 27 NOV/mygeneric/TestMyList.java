package com.vidhyac.mygeneric;

public class TestMyList {
	
	public static void main(String[] args) {
		MyList<MyEmployee> emp=new MyList<MyEmployee>();
		emp.add(new MyEmployee("Vidhya",1423,22));
		System.out.println(emp.get());
		
		MyList<MyBankAccount> bank=new MyList<MyBankAccount>();
		bank.add(new MyBankAccount("Vidhya",35000));
		System.out.println(bank.get());
	}
	
}
