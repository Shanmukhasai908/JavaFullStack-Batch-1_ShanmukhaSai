package com.ram.learning;

import java.util.ArrayList;

public class ApplyingCollections {

	public static void main(String[] args) {
	Car c=new Car();
	ArrayList<String> car=new ArrayList<>();
	ArrayList<Integer> car1=new ArrayList<>();
		c.setColor("blue");
		c.setName("abx");
        c.setPrice(89);
System.out.println("the details of the required one's are:"+c);
class Car{
	
	private String color;
	private String name;
    private Integer milage;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMilage() {
		return milage;
	}
	public void setMilage(Integer milage) {
		this.milage = milage;
	}
	public Car(String color, String name, Integer milage) {
		super();
		this.color = color;
		this.name = name;
		this.milage = milage;
	}
}   
}
}

