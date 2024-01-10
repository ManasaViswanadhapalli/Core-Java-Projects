package com.madhu.assignments;
import java.util.Scanner;

public class Assignment4 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number x");
		int x = sc.nextInt();
		System.out.println("Enter a number y");
		int y = sc.nextInt();
		System.out.println("Quotient is :" +(x/y));
		System.out.println("Reainder is :"+(x%y));
		
	}
}
