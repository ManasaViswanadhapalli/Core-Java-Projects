package com.assignment;

public class Student 
{
	void marks(int math, int physics, int java, int c)
	{
		int total = math + physics + java + c;
		float average = total / 4;
		System.out.println("Total marks :" + total);
		System.out.println("Average Total marks :" + average);
	}
	public static void main(String[] args) 
	{
		Student obj = new Student();
		obj.marks(75, 89, 93, 88);
		
	}
}
