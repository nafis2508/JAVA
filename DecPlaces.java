package W3resourcesSoln;
import java.util.*;
import java.lang.*;
import java.io.*;

public class DecPlaces {
     public static void main (String [ ] args)
     {
    	 Scanner input = new Scanner (System.in) ;
    	 //taking two floating point variables 
    	 System.out.print("Enter two floating point variables : ") ;
    	 float a = input.nextFloat( ) ;
    	 float b = input.nextFloat( ) ;
    	 a= Math.round(a*1000);
    	 a = a/1000 ;
    	 b = Math.round(b*1000) ;
    	 b = b/1000 ;
    	 if (a==b)
    	 {
    		 System.out.print("same ") ;
    	 }
    	 else 
    		 System.out.print("not same") ;
    	 
    	 
    	 
     }
}
