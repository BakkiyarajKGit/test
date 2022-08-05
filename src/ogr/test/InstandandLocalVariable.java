package ogr.test;

public class InstandandLocalVariable {
	static int a=10;
	private void one() {
		int a=20, b=10,c=20;
		System.out.println(this.a+b);
		

	}

	public static void main(String[] args) {
		InstandandLocalVariable ins=new InstandandLocalVariable();
		ins.one();
		System.out.println(a+a);

	}

}
