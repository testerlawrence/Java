package inheritance;

public class Car extends Vehicle{

	int noOfSeats;
	
	public void wipeRainWater()
	{
		System.out.println("Wipe rain water");
	}
	
	public void playRadio()
	{
		System.out.println("Play radio");
	}
	
	// Method Overriding
	// start method of parent/base Vehicle class is overridden by child Car class
	public void start()
	{
		System.out.println("Start the car");
	}
}
