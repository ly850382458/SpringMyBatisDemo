package org.com.cancer.service.impl;

import org.com.cancer.entity.Student;
import org.com.cancer.mapper.StudentMapper;
import org.com.cancer.service.IStudentService;

public class StudentServiceImpl implements IStudentService{
	
	private StudentMapper studentMapper ;
	
	
	public StudentMapper getStudentMapper() {
		return studentMapper;
	}


	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}


	@Override
	public void addStudent(Student stu) {
		studentMapper.addStudent(stu);
	}

}
