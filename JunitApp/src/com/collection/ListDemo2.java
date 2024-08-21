package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListDemo2 {

	public static void main(String[] args) {
		Set<Object> name = new LinkedHashSet<>();
		name.add("vikas");
		name.add("kiran");
		name.add("chandu");
		name.add("venkat");
		name.add("harsh");
		System.out.println(name);
		Set<Object> l = new TreeSet<>();
		l.add(23);
		l.add(88);
		l.add(29);
		l.add(20);
		System.out.println(l);
		Iterator i = l.iterator();
		while (i.hasNext())
			System.out.println(i.next());
		System.out.println("lamda");
		l.forEach(x -> System.out.println(x));

	}

}
