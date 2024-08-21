package com.verizon.exception;

public class Ex6 {
	public static void main(String[] args) throws DepositException {
		int amount= 999;
		if(amount<1000)
			throw new DepositException("minimum amount is 10000 !");
		else
			System.out.println("Thankyou for using our service");
	}

}
