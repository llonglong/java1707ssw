package com.situ.ssm.dao;

import java.util.List;

import com.situ.ssm.pojo.Banji;
import com.situ.ssm.pojo.Student;

public interface StudentDao {
	

	public List<Student> findAll();

	void deleteById(int id);
	
	public Student findById(int id);

	public void update(Student student);

	public void add(Student student);

	public List<Student> findByCondition(Student student);

	public List<Student> findBanjiCourseInfo();

	public List<Student> findBanjiCourse();

	

	

}
