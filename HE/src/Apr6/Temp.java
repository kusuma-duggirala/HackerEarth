package Apr6;

public class Temp 
{
	private static int x=10;
	private static int y=10;
	
	private Temp()
	{
		this(5);
	}
	
	private Temp(int x)
	{
		this(x,y);
	}
	
	private Temp(int x, int y)
	{
		System.out.println(x*y);
	}
	public final static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Temp t=new Temp();

	}

}
