package loopingstatements;

public class FindDuplicates 
{
	public static void main(String[] args) 
	{
		int a[] = {4,3,5,6,8,2,9,3};
		for(int i = 0; i < a.length; i++)
		{
			for(int j=i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				System.out.println(a[i]);
			}
		}
	}
}
