package ogr.test;

import java.util.Scanner;

public class BiggestNumbercheck {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if (num1>num2&&num1>num3) {
			System.out.println(num1+" is Biggest Number");
			
		} else if (num2>num1&&num2>num3)
		 		{
				System.out.println(num2+" is Biggest Number");
			
		 		} else if(num3>num1&&num3>num2)
		 		{
		 			System.out.println(num3+" is Biggest number");
		 		}
		 		else
		 		{
		 		System.out.println("The Numbers are Same");
		 		}

		if (num1>num2) 
		{
			if (num1>num3)
			{
				System.out.println(num1+" is Biggest number");
			} else 
				{
				System.out.println(num3+" is Biggest Number");
				}
		} else if (num2>num3) 
				{
				System.out.println(num2+" is Biggest Number");
				} 
				else 
				{
				System.out.println(num3+" is Biggest Number");
				}
		}
		
	}


