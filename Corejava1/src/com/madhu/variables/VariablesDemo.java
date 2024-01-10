package com.madhu.variables;

public class VariablesDemo 
{
	int a = 45;
	int b = 15;
	static int m = 30;
	static int n = 43;
	
	void add()
	{
		int x = 10;
		int y = 15;
		System.out.println("Addition of local variables:" +(x+y));
	}
	public static void main(String[] args) 
	{
		VariablesDemo vd = new VariablesDemo();
		int c = vd.a + vd.b;
		System.out.println("Addition of instance variables:" +c);
		int p = m + n;
		System.out.println("Addition of static variables:" +p);
		vd.add();
		
	}

}
