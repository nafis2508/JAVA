package W3resourcesSoln;
import java.util.*;
import java.lang.*;
import java.io.*;
public class HexatoDeci {
		public static void main (String[] args)
		{
			Scanner input = new Scanner (System.in) ;
			int number = input.nextInt() ;
			char  hex_num [] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		     int rem ;
		     String HexNum = " " ;
			while (number != 0)
			{
				rem = number % 16 ;
				HexNum = hex_num [rem] +  HexNum ;
				number = number /16 ;
			}
			System.out.print("The Hexadecimal Number: "+HexNum) ;
			
		}
	}

