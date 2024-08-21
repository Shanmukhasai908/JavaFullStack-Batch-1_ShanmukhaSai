package com.tms.java8;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class FunctionalDemo2 {

	public static void main(String[] args) {
		Consumer<Integer> consumer=(a)->System.out.println("Square: "+ a*a);
		consumer.accept(3);
		
		Consumer<String> consumer1=(name)->System.out.println(name.toUpperCase());
		consumer1.accept("VeRiZon");
		
		Supplier<Integer> s1=()->new Random().nextInt(10);
		System.out.println(s1.get());
		
		Function<Integer,Integer> f=(a)->a*a*a;
		System.out.println(f.apply(2));
		
		Function<String,Integer> f1=(s)->Integer.parseInt(s);
		System.out.println(f1.apply("20")+2);
		
		
	}

}
