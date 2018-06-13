package accessmodifier2;

import accessmodifier1.AccessModifierConcept11;

public class AccessModifierConcept22 {

	public static void main(String[] args) {
		
		// public variables can be accessed from anywhere
		// here from non-subclass in different package
		System.out.println(AccessModifierConcept11.iAmPublic);
	}
}