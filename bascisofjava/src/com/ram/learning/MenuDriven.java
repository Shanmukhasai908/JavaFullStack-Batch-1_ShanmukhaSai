package com.ram.learning;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		
		String name,country;
		int age;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the details");
		System.out.println("enter your name");
		name=scan.next();
	    System.out.println("enter your country");
	    country=scan.next();
	   System.out.println("enter your age");
	   age=scan.nextInt();
	   ArrayList<Integer> arr=new ArrayList<>();
	   ArrayList<String>  ar=new ArrayList<>();
		ar.add(name);
	    ar.add(country);
	    arr.add(age);
	    
	    System.out.println("name:"+ar);
	    System.out.println("age:"+arr);
	   System.out.println("country:"+ar); 
	 MenuDriven menu=new MenuDriven();
	
	
	class menu{
		private String country;
		private String name;
		private int age;
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	}
	}
		void record(String name,String country,int age){
			System.out.println("the details are given below");
					
			
		}
	
		
	}
	
	
