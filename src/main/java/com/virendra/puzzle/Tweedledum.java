package com.virendra.puzzle;

public class Tweedledum {

	public static void main(String[] args) {
		int j = 1;
		int y = 2;

		// compound assignment operator.

		// E1 op = E2 E1 = ( T ) (( E1 ) op ( E2 )),
		// where T is the type of E1, except that E1 is evaluated only once

		// In other words, compound assignment expressions automatically cast the
		// result of the computation they perform to the type of the variable on their
		// left-hand side.

		y += j;
		System.out.println(" x == " + y);

		// simple assignment operator ( = )
		y = y + j;

		short x = 0;
		int i = 123456;

		x += i;
		
		System.out.println(" Hidden cast "+x);
		
//		x = x + i;
	}

}
