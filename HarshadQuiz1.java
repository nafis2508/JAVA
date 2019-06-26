package homepractice;
import java.util.*;
import java.io.*;
public class HarshadQuiz1{

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in) ;
		System.out.print("Enter the  number : ") ;
		int a = input.nextInt() ;
		int number = a ;
		int rem = 0;
		int sum = 0;
		while (a>0)
		{
			rem = a % 10 ;
			sum = sum + rem ;
			a = a / 10 ;
			
		}
		if (number % sum == 0)
			System.out.print("Harshad number ") ;
		else 
			System.out.print("Not a Harshad number");
		

	}

}
