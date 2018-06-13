/************************
1) Static keyword can be used with class, variable, method and block.
2) Static members belong to the class instead of a specific instance, this means if you make a member static, you can access it without object.
*************************/

package javabasics;

public class StaticConcept {
	
	// A static variable is common to all the instances (or objects) of the class because it is a class level variable.
	// In other words you can say that only a single copy of static variable is created and shared among all the instances of the class.	
	// Static variables are also known as Class Variables.
	// Unlike non-static variables, static variables can be accessed directly in static and non-static methods.
	static int id;
	static String name;	
	
	// Non-static variables are specific to the instances.
	String street;
	
	// static method
	static void method1()
	{
		System.out.println("Static method belongs to the class.");
	}
			
	// Static block is used for initializing the static variables.
	// This block gets executed when the class is loaded in the memory.
	// A class can have multiple Static blocks, which will be executed in the same sequence in which they have been written into the program.
	// Static variables are initialized before we access them in the main method.
	static
	{
		id = 1;
		name = "This is static";
	}
	
	// A class can be made static only if it is a nested class.
	// A static class cannot access non-static members of the Outer class
	static class nestedClass
	{
		void display()
		{
			System.out.println("\n*** Display the static values from Nested Class ***");
			System.out.println("id = " + id);
			System.out.println("name = " + name);
		}
	}

	public static void main(String[] args) {
		
		// static method can be called without creating an object
		method1();
		// static methods can also be accessed with Class name
		StaticConcept.method1();
		
		System.out.println("\n *** Display the static values after setting in Static Block ***");
		System.out.println("id = " + id);
		System.out.println("name = " + name);
		
		StaticConcept obj1 = new StaticConcept();
		StaticConcept obj2 = new StaticConcept();
		
		id = 2;
		StaticConcept.name = "name2";
		
		obj1.street = "street1";		
		obj2.street = "street2";
	
		System.out.println("obj1.street = " + obj1.street);
		System.out.println("obj2.street = " + obj2.street);
		
		StaticConcept.nestedClass objNC = new StaticConcept.nestedClass();
		objNC.display();
	}
}