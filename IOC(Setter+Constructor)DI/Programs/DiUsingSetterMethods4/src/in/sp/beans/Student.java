package in.sp.beans;

public class Student
{
	private String name;
	private int rollno;
	
	private SubjectsAndMarks subjectsmarks;
	
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
	
	public SubjectsAndMarks getSubjectsmarks() {
		return subjectsmarks;
	}
	public void setSubjectsmarks(SubjectsAndMarks subjectsmarks) {
		this.subjectsmarks = subjectsmarks;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No. : "+rollno);
		System.out.println("Marks : "+subjectsmarks.getSubjmarks());
	}
}
