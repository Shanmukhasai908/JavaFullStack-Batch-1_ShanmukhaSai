package com.tms.java8;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner joinNames = new StringJoiner(",");
		
		joinNames.add("Jay");
		joinNames.add("Kiran");
		joinNames.add("Vikas");
		joinNames.add("Chandu");
		System.out.println(joinNames);
		System.out.println(joinNames.length());
		StringJoiner s1=new StringJoiner("-");
		s1.add("java");
		s1.add("python");
		System.out.println(joinNames.merge(s1));
	}

}
