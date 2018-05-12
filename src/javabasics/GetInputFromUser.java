package javabasics;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scannerObject.nextLine();
		System.out.println("Your name is: " + name);
		
		if(scannerObject != null) {
			scannerObject.close();
		}
	}
}