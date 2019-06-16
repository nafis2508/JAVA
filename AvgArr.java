package homepractice;
import java.util.*;
public class AvgArr {
  public static void main (String[ ] args)
  {
	  int a[ ] = { 4 , 5 , 6 , 1 };
	  int sum = 0 , avg = 0 , count=0 ;
	  for (int i = 0 ; i< a.length ; i++)
	  {
		  sum += a [i] ;
		  count ++ ;
		  avg  = sum / count ;
	  }
	  System.out.print(avg);
  }
}
