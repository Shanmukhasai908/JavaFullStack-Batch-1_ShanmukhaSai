package com.verizon;
import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" choose opertator 2 numbers  + , - , * , /");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		switch(ch)
		{ case '+' : { System.out.println("sum="+(a+b));
						break;
		}
		  case '-':{System.out.println("Diff="+(a-b));
		  			break;
		  			}
		  case '*': {System.out.println("Product="+(a*b));
		   			break;
		   			}
		  case '/':{System.out.println("Quotient="+(a/b));
		   			break;
		   			}
		  default : System.out.println("wrong operator !");
			
		}	
						
		}
		
	}
