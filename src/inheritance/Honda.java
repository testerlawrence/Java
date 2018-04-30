package inheritance;

public class Honda extends Car{

	public void switchOnLightsByAuto()
	{
		System.out.println("Switch on the lights automatically at night");
	}
	
	// Method Overriding
	// start method of parent/base Vehicle class is overridden by child Honda class
	public void start()
	{
		System.out.println("Start the Honda car");
	}
}
