package in.sp.beans;

public class Student
{
	private String name;
	private int rollno;
	
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
