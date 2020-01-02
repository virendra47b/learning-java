package com.virendra.puzzle;

//In summary, think about the signs of the operands and of the result whenever
//you use the remainder operator. The behavior of this operator is obvious when its
//operands are nonnegative, but it isn’t so obvious when one or both operands are
//negative.
public class Oddity {

	public static void main(String[] args) {
		int i = 2;
		System.out.println(i + " is odd " + isOdd(i));

		i = 3;
		System.out.println(i + " is odd " + isOdd(i));

		i = -3;
		System.out.println(i + " is odd " + isOdd(i));

		i = -3;
		System.out.println(i + " is odd  isOddRight " + isOddRight(i));

	}

	// The following method purports to determine whether its sole argument is an
	// odd number. Does the method work?

	// Unfortunately, it doesn’t; it returns the wrong answer one quarter of the
	// time. When i is a negative odd number, i % 2 is equal to -1 rather than 1

	public static boolean isOdd(int i) {
		return i % 2 == 1;
	}

	public static boolean isOddRight(int i) {
		return i % 2 != 0;
	}

}
