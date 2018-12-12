package com.vidhyac.dao;

import java.util.ArrayList;

import com.vidhyac.beans.bank.BankAccount;
//DAO class is my database where i store all datas
public class BankAccountDAO {
	
	ArrayList<BankAccount> accounts=null;

	public BankAccountDAO() {
		
		accounts=new ArrayList<BankAccount>();
		accounts.add(new BankAccount(101, "VidhyaC", "Savings", 35000));
		accounts.add(new BankAccount(102, "Priyanka", "Current", 55000));
		accounts.add(new BankAccount(103, "Lekha", "Savings", 10000));
		accounts.add(new BankAccount(104, "Preethi", "Current", 70000));
		accounts.add(new BankAccount(105, "Vicky", "Savings", 20000));
	}
	
	public ArrayList<BankAccount> getAccounts(){
		//System.out.println(accounts);
		return accounts;
		
	}
}
