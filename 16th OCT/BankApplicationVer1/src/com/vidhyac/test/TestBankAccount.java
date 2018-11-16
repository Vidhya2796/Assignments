package com.vidhyac.test;
//package com.vidhyac.bank;

import com.vidhyac.bank.BankAccount;
import com.vidhyac.bank.CurrentAccount;
import com.vidhyac.bank.SavingAccount;

public class TestBankAccount {
	
	public static void testBankAccountMethod(){
		//BankAccount acc=new BankAccount();
		//acc.setAccountHolderName("Vidhya");
	}
	
	public static void testSavingAccount(){
		SavingAccount savingAcc=new SavingAccount("Vidhya",5000,false);
		System.out.println("Account Holder Name is "+savingAcc.getAccountHolderName());
		System.out.println("Account No is "+savingAcc.getAccountNo());
		System.out.println("Account Balance is "+savingAcc.getAccountBalance());
		savingAcc.deposit(5000);
		System.out.println("Account Balance is "+savingAcc.getAccountBalance());
		System.out.println("********************************");
		savingAcc.withdraw(3000);
		System.out.println("Account Balance is "+savingAcc.getAccountBalance());
		
		//SavingAccount savingAcc1=new SavingAccount();
	}
	
	public static void testCurrentAccount(){
		CurrentAccount curentAcc=new CurrentAccount("Priya",40000);
		System.out.println("Account Holder Name is "+curentAcc.getAccountHolderName());
		System.out.println("Account No is "+curentAcc.getAccountNo());
		System.out.println("Account Balance is "+curentAcc.getAccountBalance());
		System.out.println("OverDraft Limit is "+curentAcc.odLimit);
		//curentAcc.deposit(5000);
		//System.out.println("Account Balance is "+curentAcc.getAccountBalance());
		//System.out.println("********************************");
		curentAcc.withdraw(20000);
		System.out.println("Account Balance is "+curentAcc.getAccountBalance());
	}
	
	public static void main(String[] args) {
		//testBankAccountMethod();
		testSavingAccount();
		testCurrentAccount();
	}
	
	
	
	
	
	
	 
}
