package com.verizon.poly;

public class Mload {
	void area(int s) {
		System.out.println("Square:"+(s*s));
	}
	void area(int l,int b) {
		System.out.println("Rect:"+(l*b));
	}
	void area(double r) {
		System.out.println("circle:"+(3.142*r*r));
	}
	public static void main(String[] args) {
		Mload m=new Mload();
		m.area(4);
		m.area(44, 40);
		m.area(9.0);
	}
}
