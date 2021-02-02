package fujitsu;

import java.util.Scanner;

public class PalindromeNumber 
{

	public static void main(String[] args) 
	{
		String intial, reverse = ""; // Objects of String class  
	      Scanner input = new Scanner(System.in);   
	      System.out.println("Enter a string or number to check if it is a palindrome");  
	      intial = input.nextLine();   
	      int length = intial.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	      {
	         reverse = reverse + intial.charAt(i);  
	      }
	      if (intial.equals(reverse))  
	      {
	         System.out.println("Given string or number is a palindrome.");  
	      }
	      else  
	      { 
	    	  System.out.println("Given string or number is not a palindrome.");  
	      }
		// TODO Auto-generated method stub
	}
}
