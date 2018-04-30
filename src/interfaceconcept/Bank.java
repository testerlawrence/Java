package interfaceconcept;

public interface Bank {

	// Properties of Interface are "static" by nature. No need to mention that.
	// Values of variables will not be changed. They are final/constant in nature.
	int minimumBalance = 1000;
	
	// Interface does not have method body
	// Access modifier OR visibility is "public" by default
	// Interface cannot have static methods.
	public void deposit();
	void withdraw();
	
	// Interface does not have main() method
	// Interfaces are abstract in nature. We can not create object of an Interface.
}
