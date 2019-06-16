package homepractice;
import java.util.*;
public class MinVal {
    public static void main (String [ ] args)
    {
    	int a [ ] = new int [5] ;
    	Scanner in = new Scanner (System.in);
    	int i  ;
    	for ( i =0;i<a.length;i++)
    	{
    		a[i] = in.nextInt( ) ;
    	}
    	int  min = a[0] ;
    	for(i = 1; i<a.length ; i++)
    	{
    		if ( a[i] < min)
    		{
    			min = a[i] ;
    		}
    		
    	}
    	System.out.print("min is : " + min  );
    }
}
