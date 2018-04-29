package javabasics;

public class ForLoop {

	public static void main(String[] args) {

		System.out.println("Simple For Loop");
		// Initialization part: a=1
		// Conditional part: a<6
		// Incremental/Decremental part: a++
		for(int a=1; a<6; a++) {
			System.out.println(a);
		}
		
		System.out.println("'break' is used to come out of an inner loop");
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				if(i==2 && j==2) {
					break;
				}
				System.out.println(i + " " + j);
			}
		}

	}

}
