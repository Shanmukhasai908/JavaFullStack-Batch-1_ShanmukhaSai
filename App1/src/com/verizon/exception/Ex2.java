package com.verizon.exception;

public class Ex2 {
	public static void main(String[] args) {
		
	
	int a=10;
	int b=0;
	int x[]= {3,4,5};
	
	try {
		try {
		int c=a/b;
		System.out.println("Result:"+c );
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		System.out.println(x[4]);
		
	}
	catch(ArrayIndexOutOfBoundsException e){
		e.printStackTrace();;
	}
	System.out.println("done ");
}
}
