// do not use the package name as "java"
package javabasics;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// byte is 8 bit integer data type
		byte lowestByte = -128;
		byte highestByte = 127;
		byte defaultByte;

		// short is 16 bit integer data type
		short lowestShort = -32768;
		short highestShort = 32767;
		short defaultShort; // can not be used without initialization

		// int is 32 bit integer data type
		int lowestInt = -2147483648;
		int highestInt = 2147483647;
		int defaultInt; // can not be used without initialization

		// long is 64 bit integer data type
		long lowestLong = -9223372036854775808l; // l is added at the end
		long highestLong = 9223372036854775807l; // l is added at the end
		long defaultLong; // can not be used without initialization

		// float is 32 bit floating point data type
		float lowestFloat; // refer http://cs-fundamentals.com/java-programming/java-primitive-data-types.php
		float highestFloat; // refer http://cs-fundamentals.com/java-programming/java-primitive-data-types.php
		float defaultFloat; // can not be used without initialization
		float sampleFloat = 1.23456f; // f is added at the end

		// double is 64 bit floating point data type
		double lowestDouble; // refer http://cs-fundamentals.com/java-programming/java-primitive-data-types.php
		double highestDouble; // refer http://cs-fundamentals.com/java-programming/java-primitive-data-types.php
		double defaultDouble; // can not be used without initialization
		double sampleDouble = 1.23456789;

		// char is 16 bit unsigned unicode character
		char lowestChar = 0; // null character
		char highestChar = 65535;
		char defaultChar; // can not be used without initialization

		// boolean
		boolean a = true;
		boolean b = false;
		boolean defaultBoolean; // can not be used without initialization

		System.out.println("Lowest Byte: " + lowestByte);
		System.out.println("Highest Byte: " + highestByte);
		System.out.println("Default Byte: " + lowestByte);

		System.out.println("Lowest Short: " + lowestShort);
		System.out.println("Highest Short: " + highestShort);
		// System.out.println("Default Short: " + defaultShort); // short can not be used without initialization

		System.out.println("Lowest Int: " + lowestInt);
		System.out.println("Highest Int: " + highestInt);
		// System.out.println("Default Int: " + defaultInt); // int can not be used without initialization

		System.out.println("Lowest Long: " + lowestLong);
		System.out.println("Highest Long: " + highestLong);
		// System.out.println("Default Long: " + defaultLong); // long can not be used without initialization

		// System.out.println("Default Float: " + defaultFloat); // float can not be used without initialization
		System.out.println("Sample Float: " + sampleFloat);

		// System.out.println("Default Double: " + defaultDouble); // double can not be used without initialization
		System.out.println("Sample Double: " + sampleDouble);

		System.out.println("Lowest Char: " + lowestChar);
		System.out.println("Highest Char: " + highestChar);
		// System.out.println("Default Char: " + defaultChar); // char can not be used without initialization

		System.out.println("Boolean a: " + a);
		System.out.println("Boolean b: " + b);
		// System.out.println("Default Boolean: " + defaultBoolean); // boolean can not be used without initialization
	}

}
