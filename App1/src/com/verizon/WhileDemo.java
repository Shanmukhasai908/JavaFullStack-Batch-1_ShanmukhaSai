package com.verizon;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		while (x <= 10) {
			x += 2;
			if (x == 4)
				continue; // it will leave the value of x where x value is 4
			System.out.println(x);
		}

	}

}
