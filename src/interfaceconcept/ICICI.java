// Is-A Relationship

package interfaceconcept;

// Multiple Inheritance is achieved by implementing multiple interfaces
public class ICICI implements Bank, MutualFunds {
	
	// The class should implement all the methods of the Interface
	public void deposit()
	{
		System.out.println("ICICI deposit");
	}
	
	public void withdraw()
	{
		System.out.println("ICICI withdraw");
	}
	
	public void buy()
	{
		System.out.println("ICICI buy");
	}
	
	public void sell()
	{
		System.out.println("ICICI sell");
	}
	
	// The class implementing the Interface can have its own methods
	public void switchFund()
	{
		System.out.println("ICICI switch fund");
	}
}
