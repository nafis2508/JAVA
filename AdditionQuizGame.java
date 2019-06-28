import java.io.*;
import java.util.*;
import java.lang.*;
public class AdditionQuizGame {
	public static void main (String[ ] args ) {
		//generating three single digit integers 
        Scanner input = new Scanner (System.in) ;
        double  a = (int) (Math.random()*10 );
        double  b = (int) (Math.random()*10) ;
        double  c = (int) (Math.random()*10);
        System.out.print(a + "\n" + b + " \n" + c +"\n") ;
        System.out.print("Enter the sum of these three numbers :") ;
        int sum = input.nextInt() , ans = 0;
        if (sum == a+b+c) {
        	ans = (int) (a+b+c) ;
            System.out.println("The answer to the problem is :" +ans) ;
        	System.out.print("So it is correct ") ;}
        	else 
        	System.out.print(" So it is incorrect ") ;        
}
}