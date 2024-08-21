package com.verizon;

public class Account {
	int acNumber;
	String name;
	double balance;
	Account(){
		acNumber=99;
		name="BankUser";
		balance=1000;
	}
	
	public Account(int acNumber, double balance) {
		super();
		this.acNumber = acNumber;
		this.balance = balance;
	}
	
	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	void deposit(int amt) {
		balance+=amt;
	}
	double withdraw(int amt) {
		balance-=amt;
		return balance;
	}
	double getBalance() {
		return balance;	
	}

}
