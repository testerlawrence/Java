package javabasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// Store similar data type values in single array variable
		// Size is fixed and hence static array. To overcome this, ArrayList and HashTable are used.
		// Similar data type can only be stored. To overcome this, Object array is used.
		// Object is a super class.
		
		//int array
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		//string array
		String b[] = {"Apple", "Banana", "Orange"};
		for(int j=0; j<b.length; j++)
		{
			System.out.println(b[j]);
		}
		
		//char array
		char c[];
		c = new char[] {'a', 'b', 'c'};
		for(int k=0; k<c.length; k++)
		{
			System.out.println(c[k]);
		}
		
		//System.out.println(c[3]); --> ArrayIndexOutOfBoundsException
		
		// 2 dimensional array
		int d[][] = new int[2][3];
		d[0][0] = 1;
		d[0][1] = 2;
		d[0][2] = 3;
		d[1][0] = 4;
		d[1][1] = 5;
		d[1][2] = 6;
		for(int m=0; m<d.length; m++)
		{
			for(int n=0; n<d[m].length; n++)
			{
				System.out.println(d[m][n]);
			}
		}
		
		// Object Array
		Object ob[] = new Object[4];
		ob[0] = 1;
		ob[1] = "Apple";
		ob[2] = 12.34;
		ob[3] = true;
		for(int p=0; p<ob.length; p++)
		{
			System.out.println(ob[p]);
		}
	}
}