package com.situ.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.situ.ssm.dao.StudentDao;
import com.situ.ssm.pojo.Banji;
import com.situ.ssm.pojo.Student;
import com.situ.ssm.service.IStudentService;
import com.situ.ssm.vo.PageBean;

@Service("studentService")
public class StudentServiceImpl implements IStudentService{
	
	@Resource(name="studentDao")
	private StudentDao studentDao;
	
	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}
	
	
	@Override
	public void deleteById(int id) {
		 studentDao.deleteById(id);
	
	}

	@Override
	public Student findById(int id) {
		return studentDao.findById(id);
	}

	@Override
	public void update(Student student) {
		studentDao.update(student);
		
	}

	@Override
	public void add(Student student) {
		studentDao.add(student);
		
	}


	@Override
	public List<Student> findByCondition(Student student) {
		// TODO Auto-generated method stub
		return studentDao.findByCondition(student);
	}


	@Override
	public List<Student> findBanjiCourseInfo() {
		// TODO Auto-generated method stub
		return studentDao.findBanjiCourseInfo();
	}


	@Override
	public List<Student> findBanjiCourse() {
		// TODO Auto-generated method stub
		return studentDao.findBanjiCourse();
	}


	@Override
	public PageBean<Student> getPageBean(Integer pageIndex, int pageSize) {
		PageBean<Student> pageBean = new PageBean<Student>();
		pageBean.setPageIndex(pageIndex);
		pageBean.setPageSize(pageSize);
		int totalCount = studentDao.getTotalCount();
		pageBean.setTotalCount(totalCount);
		int totalPage = (int) Math.ceil(1.0 * totalCount / pageSize); 
		pageBean.setTotalPage(totalPage);
		int index = (pageIndex - 1) * pageSize;
		List<Student> list = studentDao.findPageBeanList(index, pageSize);
		pageBean.setList(list);
		
		return pageBean;

	}





}
