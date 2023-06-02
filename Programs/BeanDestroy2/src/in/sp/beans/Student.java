package in.sp.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean
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
	
	public void afterPropertiesSet() throws java.lang.Exception
	{
		System.out.println("bean object initialized using 'afterPropertiesSet() method'");
		name="Kamal";
		rollno=103;
	}
	
	public void printStudentDetails()
	{
		System.out.println("Name : "+name+" => Roll No. : "+rollno);
	}
	
	public void destroy() throws java.lang.Exception
	{
		System.out.println("bean object destroyed using 'destroy() method'");
		name="";
		rollno=0;
	}
}
