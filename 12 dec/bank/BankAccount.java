package com.vidhyac.beans.bank;
//class
public class BankAccount {/*
	Create a BankAccount class with following attributes: 
		accountId, accountHolderName, accountType, accountBalance*/
	private long accountId;
	private String accountHolderName;
	private String accountType;
	private double accountBalance;
	
	
	
	
	public BankAccount(long accountId, String accountHolderName,
			String accountType, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	
	
	
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHolderName="
				+ accountHolderName + ", accountType=" + accountType
				+ ", accountBalance=" + accountBalance + "]";
	}



	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	
	
	
	
	
}