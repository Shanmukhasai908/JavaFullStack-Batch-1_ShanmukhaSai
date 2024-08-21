package com.verizon.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ex5 {
	
	public void show()throws FileNotFoundException,InterruptedException
	{
		FileReader f=new FileReader("C:\\abc.txt");
		Thread.sleep(5000);
	}
	public static void main(String[] args) throws FileNotFoundException,InterruptedException 
	{
		ex5 e1=new ex5();
		e1.show();
		System.out.println("done");
		
	}

}
