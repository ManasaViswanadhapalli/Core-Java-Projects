package collections;
import java.util.ArrayList;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(45.4);
		al.add('d');
		al.add(null);
		al.add("Sai");
		al.add(44);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.toString());
		System.out.println(al.isEmpty());
		System.out.println(al.hashCode());
		System.out.println(al.get(2));
		al.remove(2);
		System.out.println(al);
		System.out.println(al.getClass());
		System.out.println(al.clone());
		System.out.println(al.contains(23));
		al.clear();
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al);
		
	}
}
