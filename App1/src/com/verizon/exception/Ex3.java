package com.verizon.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex3 {
	public static void main(String[] args) {
		FileReader f=null;
		
		try {
			f=new FileReader("c:\\abc.txt"); 
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				f.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
