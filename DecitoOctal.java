package W3resourcesSoln;
	import java.util.*;
	import java.io.*;
	import java.lang.*;
	class DecitoOctal
	{
		public static void main (String [] args)
		{
			Scanner input = new Scanner (System.in) ;
			int number = input.nextInt( ) ;
			int octal_num[ ] = new int [100] , i = 0 ; //to store the remainder in a sequence of the same type 
			while (number != 0)
			{
				octal_num [i] = number % 8 ;
				number = number / 8 ;
				i++ ;
			}
			System.out.print("the octal number is : ") ;
			for(int j = i-1 ;j>=0;j--) //traverse the array in reverse order 
			{
			System.out.print ( octal_num[j]);
		     }
		}
	}

