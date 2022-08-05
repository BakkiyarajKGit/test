package ogr.test;

public class NumberReverseForloop {

	public static void main(String[] args) {
		int num=12345;
		String num1 = String.valueOf(num);
		String rev="";
		int length = num1.length();
		for (int i = length-1; i >=0; i++)
		{
		 rev=rev+num1.charAt(i);
		}
		System.out.println(rev);
	}

}
