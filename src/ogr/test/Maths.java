package ogr.test;

public class Maths extends AddSub
{
	public void multi() 
	{
		c=a*b;
		System.out.println("Multiplication value	: "+c);
	}
	public void division()
	{
		c=a/b;
		System.out.println("Division Value		: "+c);
	}
	public static void main(String[] args) 
	{
		Maths m=new Maths();
		m.add();
		m.sub();
		m.multi();
		m.division();

	}

}
