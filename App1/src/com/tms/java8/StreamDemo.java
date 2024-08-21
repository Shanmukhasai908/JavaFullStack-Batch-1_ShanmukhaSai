package com.tms.java8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,7,2,9,4,5);
		list.forEach(x->System.out.println(x+" "));
		System.out.println();
		//sort,filter
		System.out.println();
		list.stream().sorted().filter(x->x<=50).limit(8).forEach(x->System.out.print(x+" "));
		System.out.println();
		Optional<Integer> max=list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst();
		
		if(max.isPresent())
			System.out.println("Max: "+max.get());
		String s=null;
		Optional<String> s1=Optional.ofNullable(null);
		if(s1.isPresent())
			System.out.println(s1.get());
		else
			System.out.println("Empty !");
		
		
		List<Integer> newList=Arrays.asList(10,20,30,40,50,60,70,80,90);
		List<Integer> list2= newList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		list2.forEach(System.out::println);
		System.out.println();
		
		newList.stream().distinct().forEach(x->System.out.println(x+" ")); 
		
		long c=newList.stream().filter(x->x<40).count();
		System.out.println();
		System.out.println(c);
		
		
		
		
		
	}

}
