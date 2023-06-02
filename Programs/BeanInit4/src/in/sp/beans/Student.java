package in.sp.beans;

import javax.annotation.PostConstruct;

public class Student
{
	private String name;
	private int rollno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("name setter method called");
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		System.out.println("rollno setter method called");
		this.rollno = rollno;
	}
	
	@PostConstruct
	public void initStudentBean()
	{
		System.out.println("bean object initialized using '@PostConstruct annotation'");
		name="Ravi";
		rollno=104;
	}
	
	public void printStudentDetails()
	{
		System.out.println("Name : "+name+" => Roll No. : "+rollno);
	}
}
