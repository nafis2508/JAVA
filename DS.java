import java.util.*;

import java.lang.*;

import java.io.*;

import java.util.Scanner;

class DS{
	
      public static void main (String[] args)
 
	{
	
	    Scanner input = new Scanner (System.in);

	    System.out.print("Enter the driving distance ");

	    double distance = input.nextDouble();

	    System.out.print("Enter miles per gallon: ");

	    double miles = input.nextDouble();
	    System.out.print("Enter price per gallon: ");

	    double price = input.nextDouble();

	    double cost = distance / miles * price ;

	    System.out.println("the cost of driving "+cost);

	}

}