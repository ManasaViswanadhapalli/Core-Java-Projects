package com.assignment;

public class Calculate 
{
	void add(int a, int b)
	{
		System.out.println("Defining integer values");
		int c = a + b;
		System.out.println("Addition of a and b is : " +c);
		int d = a * b;
		System.out.println("Multiplication of a and b is : " +d);
		int e = a / b;
		System.out.println("Division of a and b is : " +e);
		int f = a % b;
		System.out.println("Modulo of a and b is : " +f);
		int x = a - b;
		System.out.println("Subtraction of a and b is : " +x);
		
	}
	void add(float a, float b)
	{
		System.out.println("Defining Decimal values");
		float c = a + b;
		System.out.println("Addition of a and b is : " +c);
		float d = a * b;
		System.out.println("Multiplication of a and b is : " +d);
		float e = a / b;
		System.out.println("Division of a and b is : " +e);
		float f = a % b;
		System.out.println("Modulo of a and b is : " +f);
		float x = a - b;
		System.out.println("Subtraction of a and b is : " +x);
	}
	
	public static void main(String[] args) 
	{
		Calculate obj = new Calculate();
		obj.add(10, 20);
		obj.add(30.1f, 20.0f);
	}
}
