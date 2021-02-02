package fujitsu;

import java.io.IOException;
import java.util.Scanner;

public class SwichCase 
{

	public static void main(String[] args) throws IOException
	{
		int day;
        Scanner SC=new Scanner(System.in);
         
        System.out.print("Enter a color code (0 to 5): ");
        day=SC.nextInt();
         
        if(day<0 || day>5)
        {
            System.out.println("Invalid color.");
            System.exit(0);
        }
         
        switch(day)
        {
              case 0: 
                  System.out.println("Red");
                  break;
              case 1: 
                  System.out.println("Green");
                  break;
              case 2: 
                  System.out.println("Orange");
                  break;
              case 3: 
                  System.out.println("Blue");
                  break;
              case 4: 
                  System.out.println("Yellow");
                  break;
              case 5: 
                  System.out.println("White");
                  break;
              default:
                  System.out.println("Invalid");
                  break; 
        }
		 // TODO Auto-generated method stub

	}
}
