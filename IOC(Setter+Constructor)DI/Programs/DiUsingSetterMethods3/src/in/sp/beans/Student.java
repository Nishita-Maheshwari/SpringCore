package in.sp.beans;

public class Student
{
	private String name;
	private int rollno;
	private float marks;
	
	private Subjects subj;
	
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public Subjects getSubj() {
		return subj;
	}
	public void setSubj(Subjects subj) {
		this.subj = subj;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No. : "+rollno);
		System.out.println("Marks : "+marks);
		System.out.println("Subjects : "+subj.getSubjects());
	}
}
