import java.util.*;
import java.io.*;
import java.lang.*;

public class GeoDisFormula {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in) ;
		System.out.println("Enter the two x values :");
		int x1 = input.nextInt() ;
		int x2 = input.nextInt() ;
		System.out.println("Enter the two y values: ");
        int y1 = input.nextInt() ;
        int y2 = input.nextInt() ;
        double  result = Math.sqrt((Math.pow(x1-x2, 2))-(Math.pow(y1-y2 ,2)));
        System.out.println(result);
	}
}
