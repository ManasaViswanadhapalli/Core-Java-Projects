package com.madhu.assignments;

import java.util.Scanner;

public class Assignment10 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a charecter ");
		char ch = sc.next().charAt(0);
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		{
			System.out.println("It is an alaphabet");
		}
		else
		{
			System.out.println("it is not an alphabet");
		}
	}
}
