package in.sp.beans;

public class Student
{
	static
	{
		System.out.println("im in static block");
	}
	
	public Student()
	{
		System.out.println("object created");
	}
	
	private String name;
	private int marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
