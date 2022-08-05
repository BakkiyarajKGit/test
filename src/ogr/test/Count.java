package ogr.test;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		int count=0;
		//10int num=1234567;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = s.nextInt();
		for (int i = 1; i <=num; i++) {
		
		if (i%2==0) {
			System.out.println(i+" is Even Number");
			
		} else {
			System.out.println(i+" is Odd Number");

		}
		
		}

	}

}
