package com.verizon;

public class AccountDemo {

	public static void main(String[] args) {
		Account account =new Account();
		account.acNumber=101;
		account.name="Ram";
		account.balance=10000.00;
		System.out.println(account);
		System.out.println(account.acNumber+" "+account.name+" "+account.balance);
		
		Account account1 =new Account();
		System.out.println(account1);
		System.out.println(account1.acNumber+" "+account1.name+" "+account1.balance);
		
		Account account2 =new Account(111,111111);
		System.out.println(account2);
		System.out.println(account2.acNumber+" "+account2.name+" "+account2.balance);
		
		Account account3 =new Account("saoi",111111);
		System.out.println(account3);
		System.out.println(account3.acNumber+" "+account3.name+" "+account3.balance);
		
		System.gc();
	}

}
