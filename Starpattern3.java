package W3resourcesSoln ;
import java.util.*;
 class Starpattern3 {

	public static void main(String[] args) {
		 int i , j ,k;
       for(i=1;i<=4;i++)
       {
    	   for(j=3;j>=i;j--)
    	   {
    		   System.out.print(" ") ;
    	   }
    	   for(k=1;k<=i;k++)
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println( ) ;
       }
	}

}
