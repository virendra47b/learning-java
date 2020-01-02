package com.virendra.puzzle;

//knowledge of the conditional operator
//In summary, it is generally best to use the same type for the second and
//third operands in conditional expressions.
public class DosEquis {

	
//	The rules for determining the result type of a conditional expression are too
//	long and complex to reproduce in their entirety, but here are three key points.
//	
//	1. If the second and third operands have the same type, that is the type of the con-
//	ditional expression. In other words, you can avoid the whole mess by steering
//	clear of mixed-type computation.
//	
//	2. If one of the operands is of type T where T is byte , short , or char and the other
//	operand is a constant expression of type int whose value is representable in
//	type T, the type of the conditional expression is T.
//	
//	3. Otherwise, binary numeric promotion is applied to the operand types, and the
//	type of the conditional expression is the promoted type of the second and third
//	operands.
//	
	public static void main(String[] args) {
		char x = 'X';
		int i = 0;
		char j = 0;
		System.out.print(true ? x : 0);
		System.out.println(false ? i : x);
		
		System.out.print(true ? x : 0);
		System.out.print(false ? j : x);

	}

}
