package com.ram.learning;

import java.util.Scanner;

public class Factoria {

	public static void main(String[] args) {
		int f=1,i;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		i=scan.nextInt();
		
		for(;i>0;i--) {
			f=f*i;
			
			
		}
System.out.println("the factoria of the number is:"+f);
	}

}
