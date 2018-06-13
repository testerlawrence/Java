package accessmodifier1;

public class AccessModifierConcept11 {
	
	public static String iAmPublic = "I am Public";
	private static String iAmPrivate = "I am Private";
	static String iAmDefault = "I am Default";
	protected static String iAmProtected = "I am Protected";

	public static void main(String[] args) {
		
		// public variables can be accessed from anywhere
		// here in same class
		System.out.println(iAmPublic);
		
		// private variables can be accessed only from the same class
		System.out.println(iAmPrivate);
		
		// default variables can be accessed in the same package only
		System.out.println(iAmDefault);
		
		// protected variables can be accessed in the same package and sub-classes in different packages
		System.out.println(iAmProtected);
	}
}