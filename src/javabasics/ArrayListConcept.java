package javabasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// Values are index based.
		// Any data type can be added.
		// Array size is not fixed.
		ArrayList arrList1 = new ArrayList();
		arrList1.add(1);
		arrList1.add("Apple");
		arrList1.add(12.34);
		arrList1.add('c');
		arrList1.add(true);
		for(int i=0; i<arrList1.size(); i++)
		{
			System.out.println(arrList1.get(i));
		}
		
		// We can restrict the data type using Wrapper classes
		ArrayList<Integer> arrList2 = new ArrayList<Integer>();
		arrList2.add(10);
		arrList2.add(20);
	}
}