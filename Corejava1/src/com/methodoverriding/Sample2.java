package com.methodoverriding;

public class Sample2 extends Sample1
{
	void show() //creating a method with same name as Sample1 it means method overriding 
	{
		super.show(); //if we use super key word it will also print Sample1
		System.out.println("Java application Developement");
	}
}
