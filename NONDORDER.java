import java.util.*;

import java.lang.*;

import java.io.*;

import java.util.Scanner;

class NONDORDER{

	public static void main (String[] args) 

	{
		
                Scanner input = new Scanner (System.in);

		int [] a = new int [3] ;

		int i ,j , temp;

		for(i=0;i<3;i++)

		{

			a[i]=input.nextInt();

		}
	
         	for(i=0;i<3;i++)
	
	        {

			System.out.print("     "+a[i]);

		}

		for(i=0;i<3;i++)

		{
		
               	     for(j=i+1;j<3;j++)

			   {

				if(a[i]>a[j])

				{

					temp = a[i];

					a[i] = a[j];

					a[j] = temp;

				}
			
}

	     }

	     System.out.print("  Non Decreasing order : ");

	     for(i=0;i<3;i++)

	     {
	
               	System.out.print("       "+a[i]);

	     }

}     

}