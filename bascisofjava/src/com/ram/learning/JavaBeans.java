package com.ram.learning;

public class JavaBeans {

	public static void main(String[] args) {
	   Car car=new Car();
	    
	    
	    car.setColor("blue");
	    car.setName("ford");
	    car.setPrice(30);
	    Car car1=new Car("red", "polo", 30);
	    
	  	    System.out.println(car);
	    System.out.println(car1);
	}	   

	}
class Car{
	private String name;
	private String color;
	public String getName() {
		return name;
	}
	public void toString(String string, String string2, int i) {
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int price;


	Car(){
		
	}
	public Car(String name, String color, int price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	}


