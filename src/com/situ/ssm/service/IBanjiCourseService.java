package com.situ.ssm.service;

import java.util.List;

import com.situ.ssm.pojo.BanjiCourse;

public interface IBanjiCourseService {

	List<BanjiCourse> findByCondition();

	void deleteById(int id);

	void add(int banjiId,int courseId);

	

	

}
