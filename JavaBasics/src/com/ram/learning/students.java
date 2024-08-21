package com.ram.learning;

public  class students implements Human {
	
	private String name;
	private String mail;
	public static void main(String[] args) {
		
		
	}
	public String mail() {
		
		return mail;
	}	
		public String name() {
			
			return name;
		
	}
public void mail(String mail) {
	this.mail=mail;
	
}
public void name(String name) {
	this.name=name;
}

public students(String name,String mail) {
	this.mail=mail;
	this.name=name;
	
}
@Override
public void eat() {

}
@Override
public void drink() {
	
}
}

