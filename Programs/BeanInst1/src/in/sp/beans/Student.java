package in.sp.beans;

public class Student
{
	private String name;
	private int rollno;
	
	public Student()
	{
		System.out.println("bean object is created using 'no-arg constructor'");
	}
	
	public Student(int a)
	{
		System.out.println("bean object is created using 'arg constructor'");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void printStudentDetails()
	{
		System.out.println("Name : "+name+" => Roll No. : "+rollno);
	}
}
