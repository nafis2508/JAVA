package homepractice;
import java.util.*;
public class ReplaceArrEle {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the size of the array :"); 
		int n = input.nextInt();
		int a [] = new int [n] ;
		int i ;
		System.out.println("Enter the elements of the array : ");
		for(i=0;i<n;i++)
		{
			a[i] = input.nextInt();
		}
		System.out.print("Enter the value you want to replace :");
		int val = input.nextInt() ;
		System.out.print("Enter the index you want to replace "+val+":");
		int index = input.nextInt() ;
		if(index>=0 && index<n)
		{
			a[index] = val ;
			for(int c : a)
				System.out.print(c+" ");
		}
	}
}
