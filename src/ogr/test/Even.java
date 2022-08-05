package ogr.test;

import java.util.Scanner;

public class Even 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		//int a=10;
		System.out.println("List of odd & Even Numbers 1 to"+a);
		
		for (int i = 1; i <= a; i++) 
		{
			if (i%2==0)
			{
				System.out.println("Even Number-->"+"\t"+i);
				
			} else
			{
				System.out.println("Odd Number--->"+"\t"+i);
			}
		}
		

	}
}


