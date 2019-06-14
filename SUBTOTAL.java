import java.util.*;
import java.lang.*;
import java.io.*;

class SUBTOTAL

{  
   public static void main (String [] args)

 {   System.out.println("Enter Subtotal and gratuity rate");
      Scanner var = new Scanner(System.in);
        double a = var.nextDouble();
        double b = var.nextDouble();
     double gratuity = (b*a)/100.0; 
     double subtotal = a + gratuity;

   System.out.println("The gratuity is = " +gratuity+ " and the subtotal is ="+subtotal);

   }
}