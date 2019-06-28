import java.util.*;
import java.lang.*;
import java.io.*;
public class NoOfDaysInAMonth {
    public static void main (String [] args)
    {
    	Scanner input = new Scanner (System.in) ;
    	System.out.println("Enter the month number and the number of year :") ;
    	int month = input.nextInt();
        int year = input.nextInt() ;
        int days = 0 ;
        String months[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
        if ( month == 1 || month ==3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
        {
        	days = 31 ; 
        	System.out.print("The month is :" + months[month-1]+"which has" +days);
        }
        else if (month == 4 || month ==6 || month==9 )
        {
        	days = 30 ;
        	System.out.print("The month is :" + months[month-1]+"which has"+days);
        }
        else if (month == 2)
        {
        	if (((year % 4 == 0) && (year % 100!= 0)) || (year% 400 == 0))
        	{
        		days = 29 ;
        		System.out.print("The month is :" + months[month-1]+"which has "+days);
        	}
        	else 
        		days = 28 ;
        	    System.out.print("The month is :" + months[month-1]+"which has"+days);
        }
    }
}
