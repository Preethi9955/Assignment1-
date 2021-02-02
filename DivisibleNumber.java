package fujitsu;

import java.util.Scanner;

public class DivisibleNumber 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);        
        long x = input.nextLong();  
        long y = input.nextLong();             
        long num = 0;         
        long count = 0;                                    
        for (num = x; x <= num && num <= y; num++) {                                                    
            if (num % 2 == 0 | num % 3 == 0 | num % 5 == 0) {
                count = count + 1;                              
            }               
        }
        System.out.println(count);  
		// TODO Auto-generated method stub

	}

}
