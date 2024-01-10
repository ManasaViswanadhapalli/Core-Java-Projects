package com.encapsulation;

public class Test 	
{
	public static void main(String[] args) 
	{
		Employee obj = new Employee();
		obj.setId(101);
		obj.setName("Manasa");
		obj.setSalary(20000);
		System.out.println("Employee ID :" +obj.getId());
		System.out.println("Employee Name :" +obj.getName());
		System.out.println("Employee Salary :" +obj.getSalary());
	}
}
