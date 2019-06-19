package W3resourcesSoln;
import java.util.*;
import java.lang.*;
import java.io.*;
public class DecimaltoBinary {
		public static void main (String[] args) throws java.lang.Exception
		{
			Scanner input = new Scanner (System.in) ;
			int a = input.nextInt( ) , i = 0 ;
			int binary_num [ ] = new int [100] ;
			while ( a != 0 ) //it will divide until the number becomes 0
			{
			  binary_num [i] = a % 2 ;
			  a = a / 2 ;
			  i++ ; //to change the index of the array where the remainder is stored
			}
			System.out.print("binary number : ") ;
			for (int j= i-1 ; j>= 0 ; j--) // to reverse the remainders that are stored 
			{
				System.out.print(binary_num[j]) ;
			}
		}
	}
