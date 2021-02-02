package fujitsu;

import java.util.Scanner;

public class AddAllValues 
{

	public static void main(String[] args) 
	{
		 int m, n, sum = 0;
	        Scanner A = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        m = A.nextInt();
	        while(m > 0)
	        {
	            n = m % 10;
	            sum = sum + n;
	            m = m / 10;
	        }
	        System.out.println("Add on value is:"+sum);
		// TODO Auto-generated method stub

	}

}
