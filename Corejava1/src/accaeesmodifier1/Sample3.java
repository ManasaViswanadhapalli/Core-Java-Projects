package accaeesmodifier1;

import accessmodifiers.Sample2;

public class Sample3 extends Sample2
{
	public static void main(String[] args)
	{
		Sample3 obj = new Sample3();
		System.out.println("a value is:" +obj.a);
		obj.show();
	}
}
