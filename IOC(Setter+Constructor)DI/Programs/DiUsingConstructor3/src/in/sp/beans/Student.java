package in.sp.beans;

public class Student
{
	private String name;
	private int rollno;
	private float marks;
	
	public Student(String name, int rollno, float marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	
	public String getName() {
		return name;
	}
	public int getRollno() {
		return rollno;
	}
	public float getMarks() {
		return marks;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No. : "+rollno);
		System.out.println("Marks : "+marks);
	}
}
