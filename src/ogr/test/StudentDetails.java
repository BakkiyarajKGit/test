package ogr.test;

public class StudentDetails {
	private void student(int id) 
	{
		System.out.println("Student Id:"+id);
	}
	private void student(String name) 
	{
		System.out.println("Student Name:"+name);
	}
	private void student(int subid, String subname) 
	{
		System.out.println("Subject id:"+subid);
		System.out.println("Subject Name:"+subname);
	}
	private void student(float mark, double avg)
	{
		
		System.out.println("Student Mark:"+(mark+2));
		System.out.println("Student Average:"+avg);
	}
	private void student(boolean res,char grade)
	{
		System.out.println("Result is Pass:"+res);
		System.out.println("Grade "+grade+"\t"+"Grade");
	}
	public static void main(String[] args) {
		StudentDetails sd=new StudentDetails();
		sd.student(123);
		sd.student("Siva A");
		sd.student(45, "Sceince");
		sd.student(590.5f, 99.9999d);
		sd.student(true, 'A');
	}

}
