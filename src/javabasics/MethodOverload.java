package javabasics;

// Method name is same.
// Number of input parameters are different.
// Input parameter's data type is different.

public class MethodOverload {

	public static void main(String[] args) {
		
		MethodOverload obj = new MethodOverload();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.add("Hello", "World");
		obj.main();
	}
	
	public void add(int a, int b)
	{
		int sum = a+b;
		System.out.println("Sum = " + sum);
	}
	
	public void add(int a, int b, int c)
	{
		int sum = a+b+c;
		System.out.println("Sum = " + sum);
	}
	
	public void add(String a, String b)
	{
		System.out.println("Sum = " + a + b);
	}
	
	public void main()
	{
		System.out.println("main method can be overloaded");
	}
}
