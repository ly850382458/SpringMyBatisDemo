package org.com.cancer.test;

import org.com.cancer.entity.Student;
import org.com.cancer.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		System.out.println("22222222222");
		IStudentService studentService = (IStudentService) context.getBean("studentService");
		System.out.println("11111111");
		Student student = new Student();
		student.setStuAge(20);
		student.setStuName("张三");
		student.setStuNo(1);
		studentService.addStudent(student);
	}

}
