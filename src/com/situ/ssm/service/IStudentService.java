package com.situ.ssm.service;

import java.util.List;

import com.situ.ssm.pojo.Banji;
import com.situ.ssm.pojo.Student;
import com.situ.ssm.vo.PageBean;

public interface IStudentService {
	public List<Student> findAll();

	public void deleteById(int id);

	public Student findById(int id);

	public void update(Student student);

	public void add(Student student);

	public List<Student> findByCondition(Student student);

	public List<Student> findBanjiCourseInfo();

	public List<Student> findBanjiCourse();

	public PageBean getPageBean(Integer pageIndex, int pageSize);



	

}
