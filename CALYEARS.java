import java.util.*;
import java.lang.*;
import java.io.*;

 class CALYEARS{
 
public static void main (String [] args)

  {

   System.out.println("Enter the Minutes");
   Scanner var= new Scanner(System.in);

   int minutes= var.nextInt();


      int  days = minutes/1440;
      int  years = days/365;
      int daysleft= years%365;
   System.out.println("The number of years is = "+years+ " and days = "+daysleft);

}

}