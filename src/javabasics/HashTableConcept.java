package javabasics;

import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		// Key-Value pair
		// Any data type can be added.
		// Size is not fixed.
		Hashtable ht1 = new Hashtable();
		ht1.put(1, 10);
		ht1.put("Ap", "Apple");
		ht1.put('c', 'x');
		ht1.put(12.34, 56.78);
		ht1.put(true, false);
		ht1.put(2, "Banana");
		ht1.put("AB", 22.33);		

		Set keys = ht1.keySet();
		for(Object key : keys)
		{
			System.out.println(ht1.get(key));
		}
		
		// We can restrict the data type using Wrapper classes
		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();
		ht2.put(1, "apple");
		ht2.put(20, "banana");
		System.out.println(ht2.get(1));
		System.out.println(ht2.get(20));
	}
}