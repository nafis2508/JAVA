import java.util.*;
import java.io.*;
import java.lang.*;
public class PentagonalNum {
	public static void main(String[] args) {
		int count = 0 ;
		for (int i= 1 ; i<= 100 ;i++)
		{
			System.out.printf("%5d", getPentagonalNumber(i)) ;
			count ++ ;
			if (count == 10)
			{
				System.out.println();
				count = 0 ;
			}
		}
	}
	public static int getPentagonalNumber (int n )
	{
		 return n * (3 * n - 1) / 2;			
	}
}
