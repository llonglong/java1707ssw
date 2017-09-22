package com.situ.ssm.dao;

import java.util.List;

import com.situ.ssm.pojo.Banji;
import com.situ.ssm.pojo.Student;

public interface BanjiDao {

	List<Banji> findAll();

	List<Banji> findBanjiCourse();

	void deleteById(int id);

	

}
