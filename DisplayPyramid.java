import java.util.*;
import java.lang.*;
import java.io.*;
public class DisplayPyramid {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in) ;
		System.out.println("Enter the number of lines between 1-15 : ") ;
		int num = input.nextInt() ;
		for(int i=1 ; i<=num ;i++) 
		{
			for(int j=num ;j>= 1;j--)
			{
				if(j>i)
				{
					System.out.print(" ") ;
				}
				else 
				{
					System.out.printf(" *") ;
				}
			}
			System.out.println() ;
		}
}
}
