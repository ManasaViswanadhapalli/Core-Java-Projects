package com.madhu.assignments;

import java.util.Scanner;

public class Assignmnet8 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter a year : ");
		
		long x = sc.nextLong();
		
		if(x % 4 == 0 && (x % 100 == 0 || x % 400 != 0))
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("It is not a leap year");
		}
	}
}
