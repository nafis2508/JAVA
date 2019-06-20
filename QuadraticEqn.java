package W3resourcesSoln;
import java.util.*;
import java.lang.*;
import java.io.*;
public class QuadraticEqn {
    public static void main ( String [] args)
    {
    	Scanner input = new Scanner (System.in) ;
    	int a = input.nextInt( ) ;
    	int b = input.nextInt( ) ;
    	int c = input.nextInt( ) ;
    	double result1 = 0 , result2 = 0 ;
    	if(a >0 && b>0 && c>0)
    	{
    		result1 = (-b + Math.pow(b*b-4*a*c,0.5))/2 ;
    		result2 = (-b - Math.pow(b*b-4*a*c,0.5))/2 ;
    	}
    	System.out.print("The first result is :"+ " " + result1) ;
    	System.out.print("The second result is :"+ " " + result2) ;
    }
}
