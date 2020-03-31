package org.com.cancer.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.com.cancer.entity.Student;
import org.com.cancer.mapper.StudentMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentMapper {

	@Override
	public void addStudent(Student stu) {
		SqlSession session = super.getSqlSession();
		StudentMapper stuDao = session.getMapper(StudentMapper.class);
		stuDao.addStudent(stu);
		
	}

}
