import java.util.*;
public class RandShufflingArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a [] = new int [5] ;
         Scanner input = new Scanner (System.in) ;
         int j = 0, temp = 0 ;
         for(int i=0 ;i<a.length;i++)
         {
        	 a[i] = input.nextInt();
         }
         for ( int i = a.length-1 ;i>0;i--)
         {
        	 j = (int) (Math.random() * (i+1)) ;
        	 //swap a[i] with a[j]
        	 temp = a[i] ;
        	 a[i] = a[j] ;
        	 a[j] = a[i] ;
         }
         for(int i=0 ;i<a.length;i++)
         {
        	 System.out.print(a[i] + " ") ;
         }
         
         
	}

}
