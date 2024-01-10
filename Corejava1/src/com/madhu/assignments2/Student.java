package com.madhu.assignments2;

public class Student 
{
		public int id = 101;
		public String Firstname = "Manasa";
		public String Lastname = "Viswa";
		public String Address = "XYZ";
		
		public void show()
		{
			System.out.println("Checking the Public modifier accessibility within the class");
		}
		public static void main(String[] args) 
		{
			Student obj = new Student();
			System.out.println(" id : " + obj.id);
			System.out.println(" Firstname : " + obj.Firstname);
			System.out.println(" Lastname : " + obj.Lastname);
			System.out.println(" Address : " + obj.Address);
			obj.show();
					
		}

}
