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
		Student std2 = (Student) context.getBean("std2");
		Student std3 = (Student) context.getBean("std3");
		
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std3);
	}
}
