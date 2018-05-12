package javabasics;

public class Continue {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++)
		{
			if(i == 5)
			{
				// after this "continue" keyword, rest of the statements in this loop does not run and
				// loop continues from start
				continue;
			}
			
			System.out.println("i = " + i);
		}
	}
}