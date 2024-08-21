package com.verizon;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length, bridth of rectangle: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		if(l >0 && b>0)
		{
			int area = (l * b);
			System.out.println("Area is :" + area);
		}
		else {
			System.out.println("Not possible, Value entered is 0 !!");
		}

	}

}
