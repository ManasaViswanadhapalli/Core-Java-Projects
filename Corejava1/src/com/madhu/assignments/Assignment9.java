package com.madhu.assignments;

import java.util.Scanner;

public class Assignment9 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter a number :");
		int x = sc.nextInt();
		
		if(x >= 0 )
		{
			System.out.println("It is a positive number :");
		}
		else
		{
			System.out.println("It is a negative number :");
		}
	}
}
