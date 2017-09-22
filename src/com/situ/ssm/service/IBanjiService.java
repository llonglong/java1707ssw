package com.situ.ssm.service;

import java.util.List;

import com.situ.ssm.pojo.Banji;
import com.situ.ssm.pojo.Student;

public interface IBanjiService {

	List<Banji> findAll();

	List<Banji> findBanjiCourse();

	void deleteById(int id);

	

}
