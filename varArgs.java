import java.util.*;
   class varArgs {
	public static void main(String[] args) {
		System.out.println(average(23,67,32,89,90,12,65)) ;

	}
	public static int average(int...numbers)
	{
		int total = 0;
		for(int i:numbers)
		{
			total += i ;
		}
		return total/numbers.length ;
	}

}
