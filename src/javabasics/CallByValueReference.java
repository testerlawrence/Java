package javabasics;

public class CallByValueReference {
	
	int a = 10;

	public static void main(String[] args) {
		
		CallByValueReference obj = new CallByValueReference();
		
		// call by value.
		// original value of the variable is not changed
		obj.callByValue(obj.a);
		System.out.println("a = " + obj.a);
		
		// call by reference
		obj.callByReference(obj);
		// original value of the variable is changed
		System.out.println("a = " + obj.a);
		
		
	}
	
	public void callByValue(int x)
	{
		x = 20;
		System.out.println("x = " + x);
	}
	
	public void callByReference(CallByValueReference obj)
	{
		obj.a = 30;
	}
}