// Is-A Relationship

package interfaceconcept;

public class HDFC implements Bank {

	// The class should implement all the methods of the Interface
	public void deposit()
	{
		System.out.println("HDFC deposit");
	}
	
	public void withdraw()
	{
		System.out.println("HDFC withdraw");
	}
	
	// The class implementing the Interface can have its own methods
	public double getRateOfInterest()
	{
		return 7.15;
	}
}
