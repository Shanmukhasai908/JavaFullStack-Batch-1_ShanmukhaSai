package com.verizon.exception;

public class Ex1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int x[]= {3,4,5};
		
		try {
			int c=a/b;
			System.out.println(x[4]);
			System.out.println("Result:"+c );
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("done ");
	}

}
