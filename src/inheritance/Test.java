// Has-a-relationship

package inheritance;

public class Test {

	public static void main(String[] args) {
	
		// static/compile-time binding/polymorphism
		// Child class object is referred by Child class reference variable
		// Method which should be run is defined during compile time itself
		Honda objHonda = new Honda();
		Maruti objMaruti = new Maruti();
		
		// Methods of Honda and Maruti classes are accessed by their own objects
		objHonda.switchOnLightsByAuto();
		objMaruti.controlSpeed();
		
		// Properties and methods of parent/base Car class are accessed by objects of Honda and Maruti child classes
		objHonda.noOfSeats = 6;
		objHonda.wipeRainWater();
		objHonda.playRadio();
		objMaruti.noOfSeats = 4;
		objMaruti.wipeRainWater();
		objMaruti.playRadio();
		
		// Properties and methods of parent/base Vehicle class are accessed by objects of Honda and Maruti child classes
		objHonda.number = "1000";
		objHonda.start();
		objHonda.run();
		objHonda.stop();
		objMaruti.number = "1000";
		objMaruti.start();
		objMaruti.run();
		objMaruti.stop();
		
		// dynamic/run-time binding/polymorphism
		// Child class object is referred by Parent class variable.
		// The method which should be run is defined during run-time.
		// This is called Top Casting.
		Car objCar = new Honda();
		objCar.start();
		
		// Down casting is not allowed in Java.
		// Parent/Base class object is referred by Child class reference variable
		// ClassCastException will be thrown at run-time
	}
}