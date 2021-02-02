package fujitsu;

import java.util.Scanner;

public class PatternProgram 
{

	public static void main(String[] args) 
	{
		int rows;
		System.out.println("Enter a row to print pattern: ");
	    Scanner input = new Scanner(System.in);
	    rows= input.nextInt();
		for (int i = rows; i >= 1; --i) 
		{
	      for (int j = 1; j <= i; ++j) 
	      {
	        System.out.print(j + " ");
	      }
	      System.out.println();
	    }
		// TODO Auto-generated method stub

	}

}
