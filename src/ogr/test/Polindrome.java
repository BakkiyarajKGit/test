package ogr.test;

import java.util.Scanner;

public class Polindrome {
//String Polindrome
	public static void main(String[] args) {
		String reverse="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String or Number If it is Polindrome");
		String orginal = s.nextLine();
		
		int length = orginal.length();
		
		for (int i = length-1; i >= 0; i--)
		{
			 reverse=reverse+orginal.charAt(i);
		}
			if (orginal.equals(reverse))
			{
				System.out.println("Polindrome");
			}else
				System.out.println("Not Polidnrome");
	}

}
