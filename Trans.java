package homepractice;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Trans {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in) ;
		int a[][]= new int [3][3] ;
		int b[][]= new int [3][3] ;
		int sum = 0 , flag = 0 ;
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
				b[j][i] = a[i][j] ;
			}
		}
		for (int i = 0;i<b.length;i++)
		{
			for (int j=0 ;j<b[i].length ;j++ )
			{
				System.out.print(b[i][j] + " ");
			}
		}
		System.out.println() ;

	}

}
