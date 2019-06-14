import java.util.*;
import java.lang.*;
import java.io.*;

public class POPU

{  
   public static void main(String[] args)
 { 
  

   System.out.println("Enter The Population: ");
    Scanner var = new Scanner(System.in);
    int x= var.nextInt();
   int incBirth= 31536000/7;
   int incMig = 31536000/45;
   int  decDeath = 31536000/13;

 int increase = incBirth + incMig - decDeath;
  for(int i=1;i<=5;i++)
 {  x =x+increase;
   System.out.println("total after  " +i+ " year is " +x);


 }


}
}