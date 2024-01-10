package com.abstractclass;

public class Test 
{
	public static void main(String[] args) 
	{
		IciciBank bank = new IciciBank();
		bank.deposit();
		bank.withdraw();
		bank.loan();
		bank.intrest();
	}
}
