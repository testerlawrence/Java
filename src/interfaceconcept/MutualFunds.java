package interfaceconcept;

public interface MutualFunds {

	// Properties of Interface are "static" by nature. No need to mention that.
	// Values of variables will not be changed. They are final/constant in nature.
	int minimumInvestment = 5000;
	
	// Interface does not have method body
	// Access modifier OR visibility is "public" by default
	// Interface cannot have static methods.
	void buy();
	public void sell();
	
	// Interface does not have main() method
	// Interfaces are abstract in nature. We can not create object of an Interface.
}
