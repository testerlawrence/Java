package javabasics;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		
		int a = 1;
		int b = a++; //post increment
		System.out.println("b = " + b);
		System.out.println("a = " + a);
		
		int c = ++a; //pre increment
		System.out.println("c = " + c);
		System.out.println("a = " + a);
		
		int d = a--; //post decrement
		System.out.println("d = " + d);
		System.out.println("a = " + a);
		
		int e = --a; //pre decrement
		System.out.println("e = " + e);
		System.out.println("a = " + a);

	}

}
