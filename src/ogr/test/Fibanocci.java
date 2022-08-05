package ogr.test;

public class Fibanocci {
//Fibonacci series
	public static void main(String[] args) {
		int f=0,s=1;
		for (int i = 0; i <=10; i++)
		{
			System.out.println(f);
			int t=f+s;
			f=s;
			s=t;
		}
	}
}
