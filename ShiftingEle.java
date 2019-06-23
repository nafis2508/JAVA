import java.util.*;
import java.io.*;
public class ShiftingEle {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in) ;
		int a[] = new int[5] ;
		 for(int i=0 ;i<a.length;i++)
         {
        	 a[i] = input.nextInt();
         }
		 int temp = a[0] ;
		 for (int i=1;i<a.length;i++)
		 {
			 a[i-1] = a[i] ;
		 }
		 a[a.length-1] = temp ;
		 System.out.print("The shifted new array :") ;
		 for(int i=0 ;i<a.length;i++)
         {
        	 System.out.print(a[i]+ " ");
         }
	}

}
