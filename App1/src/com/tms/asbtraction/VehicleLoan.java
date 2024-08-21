package com.tms.asbtraction;

public class VehicleLoan extends Loan {

	void applyLoan(String name,double amount) {
		System.out.println(name + "Vehicle loan of amount Rs"+ amount +"applied" );
	}
	void submitDocs() {
		System.out.println("Vehicle docs are submitted");
	}
	int getEmi() {
		return 899;
	}

}
