import java.util.*;
import java.lang.*;
import java.io.*;



class NEXTDAY
{


 public static void main (String [] args)
   { 
    String[] day = new String[7];
     day[0] = "Sunday";
     day[1] = "Monday";
     day[2] = "Tuesday";
     day[3] = "Wednesday";
     day[4] = "Thursday";
     day[5] = "Friday";
     day[6] = "Saturday";
     Scanner var=new Scanner(System.in);
     System.out.println("Enter today's day");
     int d= var.nextInt();
     System.out.println("Enter the number of days elapsed since today");
     int n = var.nextInt();
   System.out.println("Today is " +day[d]+ " and the future day is "+day[(n+d)%7]);
}
}