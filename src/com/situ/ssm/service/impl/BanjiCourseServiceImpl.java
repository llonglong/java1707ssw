package com.situ.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.situ.ssm.dao.BanjiCourseDao;
import com.situ.ssm.pojo.BanjiCourse;
import com.situ.ssm.service.IBanjiCourseService;

@Service("banjiCourseService")
public class BanjiCourseServiceImpl implements IBanjiCourseService{

	@Resource(name="banjiCourseDao")
	private BanjiCourseDao banjiCourseDao;

	@Override
	public List<BanjiCourse> findByCondition() {
		// TODO Auto-generated method stub
		return banjiCourseDao.findByCondition();
	}

	@Override
	public void deleteById(int id) {
		banjiCourseDao.deleteById(id);
		
	}

	@Override
	public void add(int banjiId,int courseId) {
		banjiCourseDao.add(banjiId,courseId);
		
	}

	
	

}
