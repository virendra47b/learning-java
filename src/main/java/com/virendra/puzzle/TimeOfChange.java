package com.virendra.puzzle;

import java.math.BigDecimal;

//In summary, avoid float and double where exact answers are required; for monetary calculations, 
// use int , long , or BigDecimal .
public class TimeOfChange {

	public static void main(String[] args) {
		// The problem is that the number 1.1 can’t be represented exactly as a double ,
		// so it is represented by the closest double value.
		System.out.println(2.00 - 1.10);

		// Poor solution - still uses binary floating-point!
		System.out.printf("%.2f%n", 2.00 - 1.10);

		System.out.println(new BigDecimal(2.00).subtract(new BigDecimal(1.10)));

		// Always use the BigDecimal(String) constructor,never BigDecimal(double) .
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));

	}

}
