package javabasics;

public class ClassObjectConcept {

	// global/class variables
	int number;
	String name;

	// non-static method
	// copy of all non-static methods will be given to each object reference variable
	// no input, no output
	public void method1() {
		System.out.println("Method 1");
	}

	// non-static method
	// copy of all non-static methods will be given to each object reference variable
	// no input, some output
	public int method2() {
		System.out.println("Method 2");
		return 1;
	}
	
	// non-static method
	// copy of all non-static methods will be given to each object reference variable
	// some input, no output
	public void method3(int a, int b)
	{
		// c --> local variable
		int c = a+b;
		System.out.println("c = " + c);
	}
	
	// non-static method
	// copy of all non-static methods will be given to each object reference variable
	// some input, some output
	public int method4(int a, int b)
	{
		// c --> local variable
		int c = a+b;
		System.out.println("c = " + c);
		return c;
	}

	// main() method never returns anything and hence return type is "void"
	public static void main(String[] args) {

		// object instantiation
		// new ClassObjectConcept() --> new object is created
		// obj1 --> object reference variable
		ClassObjectConcept obj1 = new ClassObjectConcept();
		obj1.number = 1;
		obj1.name = "Anand";
		System.out.println("Number = " + obj1.number);
		System.out.println("Name = " + obj1.name);
		obj1.method1();
		obj1.method2();
		System.out.println();

		// object instantiation
		// new ClassObjectConcept() --> new object is created
		// obj2 --> object reference variable
		ClassObjectConcept obj2 = new ClassObjectConcept();
		obj2.number = 2;
		obj2.name = "Bala";
		System.out.println("Number = " + obj2.number);
		System.out.println("Name = " + obj2.name);
		obj2.method1();
		obj2.method2();
		System.out.println();

		obj2 = obj1;
		System.out.println("Number = " + obj2.number);
		System.out.println("Name = " + obj2.name);
		System.out.println();
	}
}