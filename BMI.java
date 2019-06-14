import java.util.*;

import java.lang.*;

import java.io.*;

import java.util.Scanner;

class BMI{
	public static void main (String[] args)

	{

		Scanner input = new Scanner (System.in);

		double pound = input.nextDouble();

		double inches = input.nextDouble();

		double kg = pound * 0.45359237 ;

		double meters = inches * 0.0254 ;

		double BMI = kg / (meters*meters);

		System.out.println("BMI is "+ BMI);

	}

}