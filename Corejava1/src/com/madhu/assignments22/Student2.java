package com.madhu.assignments22;

import com.madhu.assignments2.Student;

public class Student2 extends Student
{
	public static void main(String[] args) 
	{
		Student2 obj = new Student2();
		System.out.println(" id : " + obj.id);
		System.out.println(" Firstname : " + obj.Firstname);
		System.out.println(" Lastname : " + obj.Lastname);
		System.out.println(" Address : " + obj.Address);
		obj.show();
				
	}
}
