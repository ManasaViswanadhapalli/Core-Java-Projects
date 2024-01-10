package com.assignment;

public class Calculate1 
{
	void add(int a, int b)
	{
		int c = a + b;
		System.out.println("Addition of two integers:" + c);
	}
	void add(int a, int b, int c)
	{
		int d = a + b + c;
		System.out.println("Addition of three integers:" + d );
		
	}
	void multiply(float a, float b)
	{
		float c = a * b;
		System.out.println("Multiplication of two integers:" + c);
	}
	void multiply(float a, float b, float c)
	{
		float d = a * b * c;
		System.out.println("Multiplication of three integers:" + d);
	}
	public static void main(String[] args) 
	{
		Calculate1 obj = new Calculate1();
		obj.add(10, 25);
		obj.add(12, 13, 15);
		obj.multiply(15, 17);
		obj.multiply(14, 28, 22);
	}
}
