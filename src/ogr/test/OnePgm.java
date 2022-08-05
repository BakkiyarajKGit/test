package ogr.test;

public class OnePgm {
	
	static int a=5;
	private void sample() {
		int a=10;
		int b=5;
		this.a=a+b;
		System.out.println(this.a);

	}

	public static void main(String[] args) {
		OnePgm o=new OnePgm();
		System.out.println(a);
		o.sample();
		
		System.out.println(a);

	}

}
