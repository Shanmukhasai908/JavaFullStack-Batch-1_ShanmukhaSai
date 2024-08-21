package com.tms.java8;
@FunctionalInterface
interface Arith<T>{
	T ops(T a, T b);
}
public class FunctionalDemo {

	public static void main(String[] args) {
		Arith<Integer> arith=(a,b)->a*a+b*b;
		System.out.println(arith.ops(2, 3));
		
		Arith<Float> arith1=(a,b)->a*a*a+b*b*b;
		System.out.println(arith1.ops(2f, 3f));
	}

}
