package homepractice; 
import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;
class SortArrrays{
	public static void main (String [] args)
	{
		int a [] = { 1 ,56 , 23 , 57 , 89 };
		String b [ ] = {"nafis", "nsu" , "java" , "php" , "gone" };
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		 System.out.println(Arrays.toString(b));
	}
}