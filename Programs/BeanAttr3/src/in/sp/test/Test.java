package in.sp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Test
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
		
		Student std1 = (Student) context.getBean("std1");
		System.out.println("Name : "+std1.getName()+" - Roll No. : "+std1.getRollno());
	}
}
