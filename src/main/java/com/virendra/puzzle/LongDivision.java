package com.virendra.puzzle;

//When working with large numbers, watch out for overflow—it’s a silent killer.
public class LongDivision {

	public static void main(String[] args) {
		// The computation is performed entirely in int arithmetic,
		// and only after the computation completes is the result promoted to a long .

		// So why is the computation performed in int arithmetic?
		// Because all the factors that are multiplied together are int values.

		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;

		System.out.println(" MICROS_PER_DAY " + MICROS_PER_DAY);
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

		// Correct Solution
		// It’s easy to fix the program by using a long literal in place of an int as
		// the first factor in each product. This forces all subsequent computations in
		// the expression to be done with long arithmetic
		final long MICROS_PER_DAY_1 = 24L * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY_1 = 24L * 60 * 60 * 1000;

		System.out.println(" MICROS_PER_DAY " + MICROS_PER_DAY_1);
		System.out.println(MICROS_PER_DAY_1 / MILLIS_PER_DAY_1);

	}

}
