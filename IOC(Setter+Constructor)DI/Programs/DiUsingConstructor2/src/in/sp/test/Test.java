package in.sp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Test
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
		
		Student std1 = (Student) context.getBean("student1");
		std1.display();
		
		Student std2 = (Student) context.getBean("student2");
		std2.display();
	}
}
