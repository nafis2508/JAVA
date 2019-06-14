import java.util.*;
import java.lang.*;
import java.io.*;


class RANDOMNO{
 public static void main (String [] args)
   {  

     Random rand = new Random();
     int x = rand.nextInt(10);
     int y = rand.nextInt(10);
     int z = rand.nextInt(10);
    int randomsum=x+y+z;
     
   System.out.println("Enter the Sum of 3 digits(integers limited to 10)");
     Scanner var= new Scanner(System.in);
     int sum = var.nextInt();
     if(sum==randomsum)
  System.out.println("you are right");
     else System.out.println("you are wrong");
}
}