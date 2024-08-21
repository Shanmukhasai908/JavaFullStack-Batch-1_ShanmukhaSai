package com.ram.learns;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//    	FranchiseCricketer franchiseCricketer = new FranchiseCricketer("VK", "MI");
//    	franchiseCricketer.play();
    	
//    	Load the context
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
    	
//    	Get a reference to the bean
        students S=context.getBean("rcb",students.class);
//    	Call methods on it
    	S.drink();
    	
    	
    	
    	
    }
}
