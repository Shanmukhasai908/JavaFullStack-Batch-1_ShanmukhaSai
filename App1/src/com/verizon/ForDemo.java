package com.verizon;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,3,4,5,6,7,8,9};// declaring array
		int sum=0;
		int product=1;
		for (int i = 0; i < a.length; i++) { // accessing values & print from array
			//System.out.println(a[i]);
			sum+=a[i]; //for sum of total values
			product*=a[i];
		}
		System.out.println("Sum :"+sum);
		System.out.println("product :"+product);
		int b[]=new int[5];
		System.arraycopy(a, 0, b, 0, 5);
		for (int i = 0; i < b.length; i++) { 
			System.out.println(b[i]);
			
		}
		
	}

}
