package javabasics;

public class IfElse {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// conditional operators
		// == (equality operator)
		// != (Not equal to)
		// > (greater than)
		// < (less than)
		// >= (greater than or equal to)
		// <= (less than or equal to)
		
		if(a == b)
		{
			System.out.println("a is equal to b");
		}
		else if(a > b)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("a is smaller than b");
		}
	}

}
