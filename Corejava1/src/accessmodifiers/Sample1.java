package accessmodifiers;

public class Sample1 
{
//	private int a = 10;
//	
//	private void show()
	protected int a = 10;
	
	protected void show()
	{
		System.out.println("Example private access modifier");
	}
	public static void main(String[] args) 
	{
		Sample1 obj = new Sample1();
		System.out.println("a value is:" +obj.a);
		obj.show();
		
	}
}
