package com.exceptionhandling;

import java.util.Scanner;

public class Arthimetic 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter a number");
		int a = sc.nextInt();
		System.out.println("Eneter b number");
		int b = sc.nextInt();
		try
		{
			int c = a/b;
			System.out.println("a/b value is:" +c);
		}
		catch(Exception e)
		{
			System.out.println("you cannot devided by zero");
		}
		finally
		{
			System.out.println("Exception is raised and handled");
		}
	
		int d = a-b;
		int e = a+b;
		int f = a*b;
		
		System.out.println("a-b value is:" +d);
		System.out.println("a+b value is:" +e);
		System.out.println("a*b value is:" +f);
	}
}

//output 
//Eneter a number
//12
//Eneter b number
//0
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Corejava1/com.exceptionhandling.Arthimetic.main(Arthimetic.java:14)


//output after handling the exception
//Eneter a number
//10
//Eneter b number
//0
//you cannot devided by zero
//Exception is raised and handled
//a-b value is:10
//a+b value is:10
//a*b value is:0