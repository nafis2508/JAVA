import java.util.*;
import java.io.*;
import java.lang.*;
public class DivWithoutOpQuiz1 {
 // the program is to execute division without using the division operator 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner obj = new Scanner (System.in) ;
		number = obj.nextInt() ;
		// number is the int that is to be divided 
		int divisor = obj.nextInt();
		int c = number + divisor , result = 0 ;
        while (c > divisor)
        {
        	c = c - divisor ;
        	result ++ ;	
        }
        System.out.print("the quotient is : "+result);
	}
}
