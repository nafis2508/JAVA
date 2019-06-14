import java.util.*;
import java.lang.*;
import java.io.*;
 

class POWER

{ public static void main (String[] args)
   {  

 System.out.println("Enter point x1 and y1");
  Scanner var = new Scanner (System.in);

  double xa= var.nextDouble();
   double ya= var.nextDouble();


   System.out.println("Enter point x2 and y2");

   double xb= var.nextDouble();
   double yb= var.nextDouble();

   double a = (xb-xa)*(xb-xa)+(yb-ya)*(yb-ya);

     double distance = Math.pow(a,0.5);


   
 System.out.println("The distance between the two points is = "+distance);
   }
  }