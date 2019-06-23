import java.util.*;
import java.io.*;
public class IndexMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in) ;
		System.out.print("Enter the elements of the array : ");
		double a [] = new double [5] ;
		double max = a[0] ;  
		int IndexOfMax = 0, i;
		for ( i=0 ; i<a.length; i++)
		{
			a[i] = input.nextDouble(); 
		}
		for(i=1 ;i<a.length;i++) {
			
			if (a[i] > max)
			{
				max = a[i] ;
				IndexOfMax = i ;
			}
          
		}
		System.out.print("The max number is :" +max+"\nThe smallest index is :"+IndexOfMax);

	}

}
