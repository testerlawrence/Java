package javabasics;

public class WrapperClasses {

	public static void main(String[] args) {
		
		String str1 = "10";
		int int1 = Integer.parseInt(str1); // convert string into integer
		System.out.println(int1 + 5);
		// NumberFormatException will occur, if you try to convert "10A" to int
		
		String str2 = "12.34";
		double d1 = Double.parseDouble(str2); // convert string into double
		System.out.println(d1 + 0.1);
		
		String str3 = "true";
		boolean b1 = Boolean.parseBoolean(str3); // convert string into boolean
		if(b1)
		{
			System.out.println("Pass");
		}
	}
}