package accessmodifier1;

public class AccessModifierConcept12 extends AccessModifierConcept11{

	public static void main(String[] args) {

		// public variables can be accessed from anywhere
		// here from subclass in same package
		System.out.println(AccessModifierConcept11.iAmPublic);
		
		// default variables can be accessed in the same package only
		System.out.println(iAmDefault);
	}
}