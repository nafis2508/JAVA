import java.util.*;
import java.io.*;
import java.lang.*;
public class Mean {

	public static void main(String[] args) {
		int a[] = {45,65,68,43,42,3} ;
		int max = a[0] ;
		for(int i=0;i<a.length;i++)
		{
			if(max < a[i])
				max = a[i] ;
		}
		int min = a[0] ;
		for(int i=0;i<a.length;i++)
		{
			if(min > a[i])
				min = a[i] ;
		}
		System.out.print((max+min)/2) ;
	}
}
