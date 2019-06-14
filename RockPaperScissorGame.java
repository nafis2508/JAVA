
import java.util.Scanner;
import java.io.*;
import java.util.*;
 class RockPaperScissor {

	public static void main(String [] args)
	{
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter input: ");
		System.out.println("where scissor(0),rock(1),paper(2): ");
		int y = input.nextInt ( ) ;
		Random output = new Random ( );
		int x = output.nextInt(3);
		System.out.println(x) ;
		if(y==x)
			System.out.print("DRAW");
		else if(y==0 && x==1)
			System.out.print("computer wins");
		else if (y==0 && x==2)
		    System.out.print("you win");
		else if (y==1 && x==0)
			System.out.print("you win ");
		else if (y==1 && x==2)
			System.out.print("computer wins");
		else if(y==2 && x==0)
			System.out.print("computer wins");
		else 
			System.out.print("you win");		
	}
}

