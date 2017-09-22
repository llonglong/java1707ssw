package com.situ.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.situ.ssm.dao.BanjiDao;
import com.situ.ssm.pojo.Banji;
import com.situ.ssm.pojo.Student;
import com.situ.ssm.service.IBanjiService;


@Service("banjiService")
public class BanjiServiceImpl implements IBanjiService{
	
	@Resource(name="banjiDao")
	private BanjiDao banjiDao;
	
	@Override
	public List<Banji> findAll() {
		// TODO Auto-generated method stub
		return banjiDao.findAll();
	}

	@Override
	public List<Banji> findBanjiCourse() {
		// TODO Auto-generated method stub
		return banjiDao.findBanjiCourse();
	}

	@Override
	public void deleteById(int id) {
		banjiDao.deleteById(id);
		
	}

	
}
