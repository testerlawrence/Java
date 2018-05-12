package constructor;

public class ChildClass extends ParentClass {
	
	// Instance variables
	String name;
	String street;
	String city;

	// Constructor initializes the newly created object.
	// Constructor does not have return type
	// Constructor has same name as class
	// If you do not implement constructor in the class, Java compiler inserts a default constructor.
	// Constructors with no arguments are called no-arg constructors.
	ChildClass() // this is no-arg constructor
	{
		/* Compiler implicitly adds the "super()" keyword here as the first statement which invokes the default constructor of parent class */
		/* Constructor of parent class is invoked when new object is created for child class */
		
		name = "John";
	}
	
	// Constructors with arguments (parameters) are called Parameterized constructors
	ChildClass(String pName) // this is parameterized constructor
	{
		/* Compiler implicitly adds the "super()" keyword here as the first statement which invokes the default constructor of parent class */
		/* Constructor of parent class is invoked when new object is created for child class */
		
		name = pName;
	}
	
	ChildClass(int pId, String pName)
	{
		/* Compiler implicitly adds the "super()" keyword here as the first statement which invokes the default constructor of parent class */
		/* Constructor of parent class is invoked when new object is created for child class */
		
		// When a constructor calls another constructor of the same class, it is called "Constructor Chaining".
		// Constructor call, if used, must be the first statement in a constructor
		this("Street 1", "Coimbatore");
		
		name = pName;
		
		//System.out.println("Street: " + street);
		//System.out.println("City: " + city);
	}
	
	ChildClass(String pStreet, String pCity)
	{
		/* Compiler implicitly adds the "super()" keyword here as the first statement which invokes the default constructor of parent class */
		/* Constructor of parent class is invoked when new object is created for child class */
		
		street = pStreet;
		city = pCity;
	}
	
	// copy constructor
	ChildClass(ChildClass pObj)
	{
		/* Compiler implicitly adds the "super()" keyword here as the first statement which invokes the default constructor of parent class */
		/* Constructor of parent class is invoked when new object is created for child class */
		
		name = pObj.name;
		street = pObj.street;
		city = pObj.city;
	}
	
	/* Having more than one constructor with different parameters is known as Constructor Overloading */

	public static void main(String[] args) {

		// new keyword creates an object of class ChildClass and
		// invokes the constructor to initialize the newly created object
		ChildClass obj1 = new ChildClass(); // no-arg constructor is invoked

		System.out.println(obj1.name);

		// Parameterized constructor with String parameter is invoked
		ChildClass obj2 = new ChildClass("Peter");
		System.out.println(obj2.name);

		// Parameterized constructor with two arguments (int, String) is invoked
		ChildClass obj3 = new ChildClass(1, "Kennady");
		System.out.println("\n*** Display obj3 values ***");
		obj3.display();

		// Parameterized constructor with object as argument is invoked
		ChildClass obj4 = new ChildClass(obj3);
		System.out.println("\n*** Display obj4 values ***");
		obj4.display();
	}

	void display()
	{
		System.out.println(name);
		System.out.println(street);
		System.out.println(city);
	}
}