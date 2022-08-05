package ogr.test;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		
		//int number=9;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Limit: ");
		int number = s.nextInt();
		
		int a=1;
		
		System.out.println("List of Odd Numbers:");

		while (a<=number)
		{
			System.out.println(a);
			a=a+2;
		}
		
	}

}
