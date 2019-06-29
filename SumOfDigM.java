import java.util.*;
import java.io.*;
import java.lang.*;
public class SumOfDigM {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in) ;
		long number = input.nextLong();
		System.out.print(sumDigits(number));
        

	}
    public static int sumDigits(long n) {
    	int   sum = 0 ,rem = 0;
    	while (n>0)
    	{
    	   rem =(int) (n % 10);
    	   sum += rem ;
    	   n = n / 10 ;
    	}
    	return sum ;
    }
}