package com.verizon.poly;

public class Ride {
	void sq(int s) {
		System.out.println("area of sq:"+(s*s));
	}
}
 class Mride1 extends Ride{
	@Override
	void sq(int s) {
		System.out.println("Perimeter: "+ (4*s));
	}
	public static void main(String[] args) {
		Mride1 m = new Mride1();
		m.sq(4);
		Ride r=new Mride();
		r.sq(4);
		r=new Ride();
		
	}
}
