package in.sp.factory;

import in.sp.beans.Student;

public class StudentFactory
{
	public Student createStudentObj()
	{
		System.out.println("bean object is created using 'Instane Factory Method'");
		return new Student(10);
	}
}
