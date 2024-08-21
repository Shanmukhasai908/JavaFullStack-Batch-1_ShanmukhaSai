package com.ram.learning;

import java.util.Scanner;

public class Additions {
	int total=0;
	public static void main(String[] args) {
		new Additions().sum();
	}
		void sum() {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the range");
			int a=scan.nextInt();
		for(int i=1;i<=a;i++) 
			if(i%3==0 || i%5==0) {
				total=total+i;
				
			}
			System.out.println(total);
		
		}
	}