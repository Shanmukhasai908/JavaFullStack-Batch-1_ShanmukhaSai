package com.ram.learning;

import java.util.Scanner;

public class FibnocciSeries {

	public static void main(String[] args) 
	{
		int first=1,second=1,third;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the range");
		int n=scan.nextInt();
		System.out.println(first+" "+second);
		 for(third=2;third<=n;) {
			 
			 third=first+second;
		 
		System.out.println(""+third);
	
	first=second;
	second=third;
}
}		
}
		
	
	

	


