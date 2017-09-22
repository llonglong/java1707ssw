package com.situ.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.situ.ssm.dao.CourseDao;
import com.situ.ssm.pojo.Course;
import com.situ.ssm.service.ICourseService;

@Service("courseService")
public class CourseServiceImpl implements ICourseService{
	
	@Resource(name="courseDao")
	private CourseDao courseDao;
	@Override
	public List<Course> findAll() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

}
