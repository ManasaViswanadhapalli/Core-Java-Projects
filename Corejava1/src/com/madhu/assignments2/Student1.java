package com.madhu.assignments2;

public class Student1 extends Student
{
	public static void main(String[] args) 
	{
		Student1 obj = new Student1();
		System.out.println(" id : " + obj.id);
		System.out.println(" Firstname : " + obj.Firstname);
		System.out.println(" Lastname : " + obj.Lastname);
		System.out.println(" Address : " + obj.Address);
		obj.show();
				
	}

}
