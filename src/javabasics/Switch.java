package javabasics;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number from 1 to 5:");
		int number = scanner.nextInt();
		
		switch(number) {
		case 1:
			System.out.println("Number is 1");
			break;
		case 2:
			System.out.println("Number is 2");
			break;
		case 3:
			System.out.println("Number is 3");
			break;
		case 4:
			System.out.println("Number is 4");
			break;
		case 5:
			System.out.println("Number is 5");
			break;
		default:
			System.out.println("Number is not in the range: 1 to 5");
		}
		
		if(scanner != null) {
			scanner.close();
		}
	}
}