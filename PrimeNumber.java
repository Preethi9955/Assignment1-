package fujitsu;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println ("Enter the Number: ");
		int num;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		boolean flag = false;
		for (int i = 1; i <= num / 5; ++i) 
			{
      
				if (num % i == 0) 
					{
						flag = true;
						break;
					}
			}

				if (!flag)
					System.out.println(num + " is a prime number.");
				else
					System.out.println(num + " is not a prime number.");
	}
}
