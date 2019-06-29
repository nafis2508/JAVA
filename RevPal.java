import java.util.*;
import java.lang.*;
import java.io.*;
public class RevPal {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in) ;
		int x = input.nextInt() ;
		System.out.println("The reverse number is "+reverse(x)) ;
		String s = isPalindrome(x) ? " " : " not" ;
		System.out.println(x + " is" + s + " Palindrome") ;
	}
	 public static boolean isPalindrome (int number)
	    {
	    	if (number == reverse(number) ) 
	    			{
	    		       return true ;
	    			}
	    	return false ;
	    }
    public static int reverse (int number)
    {
    	int rem = 0 , rev = 0 ;
    	while (number != 0 )
    	{
    		rem = number  % 10 ;
    		rev = rev * 10 + rem ;
    		number /= 10 ;
    	}
    	return rev ;
    }
   
}
