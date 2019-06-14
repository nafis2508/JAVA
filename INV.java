import java.util.*;

import java.lang.*;

import java.io.*;

import java.util.Scanner;

class INV{
	
   public static void main (String[] args)

	{
	     
          double investmentAmount , annualInterestRate , years ;

	  Scanner input = new Scanner (System.in);

	  investmentAmount = input.nextDouble();

	  annualInterestRate = input.nextDouble();

	  years = input.nextDouble();

	  double futureInvestmentValue ;
	  futureInvestmentValue = investmentAmount * (1 + Math.pow(annualInterestRate,years) + Math.pow(annualInterestRate,12));
	     System.out.println("Accumulated value is : "+futureInvestmentValue);

}

}