package ogr.test;

public class EvenNumbers {

	public static void main(String[] args) {
		int number=10;
		System.out.println("List of Even Numbers 1 to"+number);
		for (int i = 1; i <= number; i++) {
			if (i%2==0) 
			{
				System.out.println(i);
			}
			
		}

	}

}
