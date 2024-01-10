package com.constructor;

public class Sample 
{
	Sample()
	{
		System.out.println("Default Constructor");
	}
	Sample(int a, int b)// parameterised constructor
	{
		this(); // constructor chaining
		int c = a + b;
		System.out.println("a + b value is:" +c);
	}
	Sample(int a, int b, int c)// constructor overloading
	{
		this(100, 200);
		int d = a + b + c;
		System.out.println("a + b + c value is:" +d);
	}
}
