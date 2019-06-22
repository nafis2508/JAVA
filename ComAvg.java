import java.util.*;
import java.io.*;

public class ComAvg {

	public static void main(String[] args) {
	     Scanner input = new Scanner (System.in) ;
	     System.out.print("enter the size of your array : ");
	     int n = input.nextInt() ;
	     int i  , Negcount = 0 ,Poscount = 0 ;
	     double avg = 0, total = 0 ;
	     double  a[ ] = new double [n];
	     System.out.print("Enter the elements of the array and it ends if you input zero : ") ;
	     for ( i=0 ;i<a.length;i++)
	     {
	    	 a [i] = input.nextDouble( ) ;
	    	 if(a[i] == 0)
	    	 break ;
	     }
	     System.out.print("the array is : ");
	     for(i=0 ;i<a.length;i++)
	     {
          
	    	System.out.println(a[i]);
	     }
	     for(i=0 ; i<a.length ;i++)
	     {
	        if (a[i] > 0)
	         {
	    	   Poscount++ ;
	         }
	     }
	     System.out.println("The number of positive values : " + Poscount);
	     for(i=0 ; i<a.length ;i++)
	     {
	        if (a[i] < 0)
	        {
	    	   Negcount++ ;
	        }
	     }
	     System.out.println("The number of negative values : "+ Negcount);
	     for (i=0 ;i<a.length;i++)
	     {
	    	 total = total + a[i] ;
	     }
	     for(i=0 ;i<a.length;i++)
	     {
	    	 avg = total / (Poscount+Negcount) ;
	     }
	     System.out.print("The average of the numbers is : ") ;
	     System.out.printf("%.3f", avg) ;
	}

}
