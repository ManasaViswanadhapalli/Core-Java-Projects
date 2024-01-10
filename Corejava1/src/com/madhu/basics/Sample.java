package com.madhu.basics;
import java.util.Scanner;

public class Sample 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m1 marks");
		int m1 = sc.nextInt();
		System.out.println("Enter m2 marks");
		int m2 = sc.nextInt();
		System.out.println("Enter m3 marks");
		int m3 = sc.nextInt();
		System.out.println("Total marks: " + (m1+m2+m3));
		System.out.println("Average: " +(m1+m2+m3)/6 );
		
	}


}
