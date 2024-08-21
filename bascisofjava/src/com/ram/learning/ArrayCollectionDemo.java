package com.ram.learning;

import java.util.ArrayList;

public class ArrayCollectionDemo {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		
				arr.add(23);
				arr.add(36);
				arr.add(65);
				arr.add(20);
				arr.add(45);
				System.out.println(arr);
	
ArrayList<String> bb=new ArrayList<String>();
bb.add("RAM");
bb.add("TEJA");
bb.add("llkk");
				System.out.println(bb);
			//the for loop
			for(int index=0; index<bb.size();index++) {
				System.out.println(bb.get(index));
	}
			
					
			//java 5 enhanced for loop
				for(Object value:bb) {
					System.out.println(bb);
			
					
				}
//java for loop
				arr.forEach(System.out::println);
				bb.forEach(System.out::println);
				
				
					
				
				}
					
				
				
				
	}






