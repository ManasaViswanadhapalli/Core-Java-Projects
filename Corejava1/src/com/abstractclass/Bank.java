package com.abstractclass;

public abstract class Bank 
{
	void deposit()
	{
		System.out.println("you can deposite up to 10 lakhs");
	}
	void withdraw()
	{
		System.out.println("you can withdraw up to 15 lakhs");
	}
	abstract void loan();
	abstract void intrest();
}
