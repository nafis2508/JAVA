package homepractice;
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class BubbleSort {
	public static void main(String[] args)
	{
		String a [] = {"nafis","nsu","java","gone","great"} ;
		String temp  ;
		int  flag = 0 ;
				
		for(int i= 0 ; i<a.length;i++)
		{ 
			
			for(int j=0 ; j<a.length-1-i;j++)
			{
				if(a[j]. compareTo (a[j+1]) > 0)
				{
				   temp = a[j] ;
				   a[j] = a[j+1] ;
				   a[j+1] = temp ;
				   flag=1;
				}
				
			}
			if(flag == 0)
			{
				break ;
			}
		}
			
			for(int k=0 ; k<a.length;k++)	
			{
				System.out.println(a[k]+" ");
			}
			
	}
}
	

