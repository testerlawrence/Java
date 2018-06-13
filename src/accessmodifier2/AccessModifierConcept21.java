package accessmodifier2;

import accessmodifier1.AccessModifierConcept11;

public class AccessModifierConcept21 extends AccessModifierConcept11{

	public static void main(String[] args) {
		
		// public variables can be accessed from anywhere
		// here from subclass in different package
		System.out.println(AccessModifierConcept11.iAmPublic);
		
		// protected variables can be accessed in the same package and sub-classes in different packages
		System.out.println(iAmProtected);
	}
}