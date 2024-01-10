package controlstatements;

import java.util.Scanner;

public class Practice 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter Maths Marks");
		int math = sc.nextInt();
		System.out.println("Eneter java Marks");
		int java = sc.nextInt();
		System.out.println("Eneter python Marks");
		int python = sc.nextInt();
		System.out.println("Eneter c Marks");
		int c = sc.nextInt();
		System.out.println("Eneter b Marks");
		int b = sc.nextInt();
		System.out.println("Eneter a Marks");
		int a = sc.nextInt();
		
		int total = math+java+python+c+b+a;
		System.out.println("Total marks :" +total);
		int average = (math+java+python+c+b+a)/6;
		System.out.println("Average:"+ average);
		
		if(average >= 80)
		{
			System.out.println("Passed with distinction");
		}
		else if(average >= 60 & average < 80)
		{
			System.out.println("Passed with A grade");
		}
		else if(average >= 50 & average < 60)
		{
			System.out.println("Passed with B grade");
		}
		else if(average >= 35 & average < 50)
		{
			System.out.println("Passed with c grade");
		}
		else 
		{
			System.out.println("not passed");
		}
		sc.close();
	}
	
}
