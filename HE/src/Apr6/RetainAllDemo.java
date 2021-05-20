package Apr6;

import java.util.ArrayList;

public class RetainAllDemo 
{
	static ArrayList<String> al1=new ArrayList<>();
	static ArrayList<String> al2=new ArrayList<>();
	public static void main(String[] args) 
	{
		al1.add("two");
		al1.add("times");
		al1.add("three");
		al1.add("is");
		al1.add("not");
		al1.add("four");
		
		al2.add("two");
		al2.add("times");
		al2.add("two");
		al2.add("is");
		al2.add("four");
		al1.retainAll(al2);
		System.out.println(al1);
		System.out.println(al2);
		

	}

}
