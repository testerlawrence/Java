package constructor;

public class ParentClass {

	// Whenever a child class constructor gets invoked, it implicitly invokes the constructor of parent class. 
	ParentClass()
	{
		System.out.println("Constructor of ParentClass is called");
	}
}