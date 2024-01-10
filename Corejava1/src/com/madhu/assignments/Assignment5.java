package com.madhu.assignments;
import java.util.Scanner;

public class Assignment5 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a number");
		int x = sc.nextInt();
		System.out.println("Checking the number is even or odd :" +(x%2 == 0) );
	}
}
