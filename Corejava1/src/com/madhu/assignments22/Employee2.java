package com.madhu.assignments22;

import com.madhu.assignments2.Employee;

public class Employee2 extends Employee
{
	public static void main(String[] args) 
	{
		Employee2 obj = new Employee2();
		System.out.println(" id : " + obj.id);
		System.out.println(" Name : " + obj.Name);
		System.out.println(" Salary : " + obj.Salary);
		System.out.println(" Address : " + obj.Address);
		System.out.println(" Mobilenumber : " + obj.Mobilenumber);
		obj.show();
				
	}
}
