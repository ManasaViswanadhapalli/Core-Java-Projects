package com.madhu.assignments2;

public class Employee1 extends Employee
{
	public static void main(String[] args) 
	{
		Employee1 obj = new Employee1();
		System.out.println(" id : " + obj.id);
		System.out.println(" Name : " + obj.Name);
		System.out.println(" Salary : " + obj.Salary);
		System.out.println(" Address : " + obj.Address);
		System.out.println(" Mobilenumber : " + obj.Mobilenumber);
		obj.show();
	}
}
