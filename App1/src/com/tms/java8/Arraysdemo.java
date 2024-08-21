package com.tms.java8;

import java.util.Arrays;
import java.util.List;

public class Arraysdemo {

	public static void main(String[] args) {
		int a[]= {5,6,2,8,4,9,1,3,7};
		for(int x:a)
			System.out.print(x +" ");
		System.out.println();
		Arrays.sort(a);
		for(int x:a)
			System.out.print(x + " ");
		//---------------------------------------
		System.out.println();
		int b[]=new int[5];
		Arrays.fill(b, 99);
		for(int x:b)
			System.out.print(x + " ");
		System.out.println(Arrays.compare(a,b));
		//----------------------------------------
		System.out.println();
		List<Integer> list=Arrays.asList(5,6,7,3,4,1,8,9);
		list.forEach(x->System.out.print(x +" "));
		//----------------------------------------
		System.out.println(" ");
		list.forEach(System.out::print);
		
		
		
		
		
				
	}

}
