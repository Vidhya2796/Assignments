package com.vidhyac.bank;//collection of logical classes

//public abstract class BankAccount {
public abstract class BankAccount {
	
	//i hav 2 objects for that 
	//static variable---it has only one copy which shared among all the objects
	//static variable are not depend on objects/object creation
	//during class loading itself the static var got initialised
	private static int autoAccountNo;
	
	//instance variables/member variables / class variables//instance variables existence belong to the objects
	//we cannot access instance variable if objects are not created/not exist 
	private int accountNo;
	private String accountHolderName;
	protected double accountBalance;
	
	//init block
	//init execute well before constructor
	{
		accountNo=++autoAccountNo;
	}
	
	//constructor overloading
	//the job of constructor is to initialize the instance variable
	//at the time of object creation,the constructor will get automatically called
	//can't use constructor in for loop and all..bcoz it is logically not correct..
	//bulk acnt nos  are created without demanding information
	public BankAccount(){ //default constructor eg capgemini-- bankacnt kit in our first day of joining
		accountHolderName="Unknown";
		accountBalance=0;	
	}
	
	
	//parameterized constructor--i will create obj only after u supplied ur info/document
	//normal scenario in bank,,,user supplied variable,,,eg generic user
	
	public BankAccount(String accountHolderName,double accountBalance) {
		
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
		
	}
	//conceptual method...setter method..to set acc holder name..
	//set conceptual method is used to modify the existing value ie updating
	//we shldn't use set method for transactional variables like acntbal and acntno
	//i can modify/reinitialise member variables the data after the object is created
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	//getter methods are like giving read only access to the user...cannot modify or write the data..only data can be viewed
	public int getAccountNo() {
		return accountNo;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public double getAccountBalance() {
		return accountBalance;
	}

	public abstract void withdraw(double amount);
	/*{
		if(amount <=0)
			System.out.println("Enter a valid amount");
		if(amount > this.accountBalance)
			System.out.println("your withdraw amount is greater than your balance!!");
		this.accountBalance-=amount;
	}*/
	
	public void deposit(double amount){
		this.accountBalance+=amount;
	}
	
	
	
}
