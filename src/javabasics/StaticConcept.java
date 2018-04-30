package javabasics;

public class StaticConcept {
	
	// static variables
	// A static variable is common to all the instances (or objects) of the class because it is a class level variable.
	// In other words you can say that only a single copy of static variable is created and shared among all the instances of the class.
	// Memory allocation for such variables only happens once when the class is loaded in the memory.
	// Static variables are also known as Class Variables.
	// Unlike non-static variables, static variables can be accessed directly in static and non-static methods.
	static int id;
	static String name;
	
	// non-static (instance) variable
	// Non-static variables are specific to the instances.
	String street;
	
	// static method
	static void method1()
	{
		System.out.println("Static method belongs to the class.");
	}
		
	// static block
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
		
		obj1.id = 2;
		obj1.name = "name2";
		obj1.street = "street2";
		
		obj2.id = 3;
		obj2.name = "name3";
		obj2.street = "street3";
		
		System.out.println();
		System.out.println("obj1.id = " + obj1.id);
		System.out.println("obj1.name = " + obj1.name);
		System.out.println("obj1.street = " + obj1.street);
		
		System.out.println();
		System.out.println("obj2.id = " + obj2.id); // static variable is overwritten here since it is common to all instances
		System.out.println("obj2.name = " + obj2.name); // static variable is overwritten here since it is common to all instances
		System.out.println("obj2.street = " + obj2.street); // non-static variable is not overwritten since it is specific to individual instances
		
		StaticConcept.nestedClass objNC = new StaticConcept.nestedClass();
		objNC.display();
	}
}

/************************
1) Static keyword can be used with class, variable, method and block.
2) Static members belong to the class instead of a specific instance, this means if you make a member static, you can access it without object.
*************************/
