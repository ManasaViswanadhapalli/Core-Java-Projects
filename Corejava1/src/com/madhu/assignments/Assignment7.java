package com.madhu.assignments;
import java.util.Scanner;

public class Assignment7 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a first number");
		double a = sc.nextDouble();
		System.out.println("Eneter a second number");
		double b = sc.nextDouble();
		System.out.println("Eneter a Third number");
		double c = sc.nextDouble();
		
		if(a >= b && a >= c)
		{
			System.out.println("a is a largest number");
		}
		else if(b >= a && b >= c)
		{
			System.out.println("b is a largest number");
		}
		else if(c >= a || c >= b)
		{
			System.out.println("c is a largest number");
		}
		else
		{
			System.out.println("Please enter a integer");
		}
	}
}
