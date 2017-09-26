package com.situ.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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

	public int getTotalCount();

	public List<Student> findPageBeanList(@Param("index")int index, @Param("pageSize")int pageSize
);

	

	

}
