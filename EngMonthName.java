import java.util.*;
import java.lang.*;
import java.io.*;
public class EngMonthName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int x = (int)(Math.random()*13) ;
		System.out.println(x) ;
		System.out.println("The English Month is : "+ month[x-1]) ;
	}

}
