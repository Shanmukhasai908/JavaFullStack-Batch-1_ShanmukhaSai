package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListDemo {

	public static void main(String[] args) {
		
		List<Object> l=new ArrayList();
		l.add(22);
		l.add("jjjj");
		l.add(66.0);
		l.add(17792);
		l.add(66.0);
		//System.out.println(l);
		//System.out.println(l.size());
		l.remove(2);
		//System.out.println(l);
		//System.out.println(l.contains("sai"));
		//System.out.println(l.isEmpty());
		//System.out.println(l.lastIndexOf(66.0));
		l.add(88);
		l.add("sai");
		//System.out.println(l);
		ArrayList a1=new ArrayList();
		l.addAll(a1);
		a1.add(88);
		a1.add(29);
		a1.add(20);
		System.out.println(a1);
		//System.out.println(l.containsAll(a1));
		
		for(Object o:l)
			System.out.println(o);
		Iterator i=l.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println("lamda");
		l.forEach(x->System.out.println());
		
		
	}

}
