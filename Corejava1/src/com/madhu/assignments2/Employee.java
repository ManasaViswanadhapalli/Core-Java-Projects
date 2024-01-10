package com.madhu.assignments2;

public class Employee 
{
	public int id = 101;
	public String Name = "Manasa";
	public float Salary = 11111;
	public String Address = "XYZ";
	public long Mobilenumber = 1233456;
	
	public void show()
	{
		System.out.println("Checking the Private modifier accessibility within the class");
	}
	public static void main(String[] args) 
	{
		Employee obj = new Employee();
		System.out.println(" id : " + obj.id);
		System.out.println(" Name : " + obj.Name);
		System.out.println(" Salary : " + obj.Salary);
		System.out.println(" Address : " + obj.Address);
		System.out.println(" Mobilenumber : " + obj.Mobilenumber);
		obj.show();
				
	}
}
