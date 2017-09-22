package com.situ.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.situ.ssm.pojo.BanjiCourse;

public interface BanjiCourseDao {

	List<BanjiCourse> findByCondition();

	void deleteById(int id);

	void add(@Param(value="banjiId")int banjiId,@Param(value="courseId")int courseId);
}
