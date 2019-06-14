import java.util.*;

import java.lang.*;

import java.util.Scanner;

class CONVERSION
{
	
   public static void main(String [] args)
	
    {
		
       Scanner input = new Scanner(System.in);
		
       System.out.print("Enter celsius degree ");
	
       double celsius= input.nextDouble();
		
       double fahrenheit ;
	
       fahrenheit= (9 / 5) * celsius + 32 ;
	
       System.out.println("The required value in fahrenheit="+fahrenheit);
	
     }

}