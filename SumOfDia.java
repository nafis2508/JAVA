package homepractice;
import java.util.*;
import java.io.*;
import java.lang.*;

public class SumOfDia {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in) ;
		int a[][]= new int [3][3] ;
		int sum = 0;
		System.out.print("Enter the elements of the array : ") ;
		for (int i = 0;i<a.length;i++)
		{
			for (int j=0 ;j<a[i].length ;j++ )
			{
				a[i][j] = input.nextInt() ;
			}
		}
		for (int i = 0;i<a.length;i++)
		{
			for (int j=0 ;j<a[i].length ;j++ )
			{
				if(i==j)
				sum = sum + a[i][j] ;
			}
		}
		
			System.out.print(sum);
		
	}

}
