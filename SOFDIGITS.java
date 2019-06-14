import java.util.*;
import java.lang.*;
import java.io.*;

class SOFDIGITS
{ 

 public static void main (String[] args) 
   { 


   System.out.println("Enter a integer number ");

    Scanner var = new Scanner(System.in);
     int x= var.nextInt();
   int l=0,c=0;

    
    do { l=x%10;
         c+=l;
         x=x/10;
   }while(x>0);
  System.out.println("The Sum is " +c);
       
}
 }