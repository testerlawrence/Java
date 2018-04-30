package interfaceconcept;

public class Test {

	public static void main(String[] args) {
		
		// Static variable is accessed using Class name 
		System.out.println("Minimum Bank Balance = " + Bank.minimumBalance);
		System.out.println("Minimum MF Investment = " + MutualFunds.minimumInvestment);
		
		HDFC objHdfc = new HDFC();
		objHdfc.deposit();
		objHdfc.withdraw();
		System.out.println("HDFC Rate of Interest = " + objHdfc.getRateOfInterest());
		
		ICICI objIcici = new ICICI();
		objIcici.deposit();
		objIcici.withdraw();		
		objIcici.buy();
		objIcici.sell();
		objIcici.switchFund();
	}
}