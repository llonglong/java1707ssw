package com.situ.ssm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.ssm.pojo.Student;

@Controller
@RequestMapping(value="/json")
public class JsonController {
	
	@RequestMapping("/requestJson")
	public @ResponseBody Student requestJson(@RequestBody Student student){
		System.out.println(student);
		return student;
		
	}
	
	@RequestMapping("/responseEntity")
	public @ResponseBody Student responseEntity(/*@RequestBody*/ Student student){
		System.out.println(student);
		return student;
		
	}
	
	@RequestMapping("/responseList")
	public @ResponseBody List<Student> responseList(@RequestBody Student student){
		System.out.println(student);
		List<Student>list = new ArrayList<Student>();
		Student stu1 = new Student("zhangsan", 20, "ÄÐ", "Çàµº");
		Student stu2 = new Student("lisi", 20, "ÄÐ", "Çàµº");
		Student stu3 = new Student("nalu", 20, "ÄÐ", "Çàµº");
		Student stu4 = new Student("mahu", 20, "ÄÐ", "Çàµº");
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		
		return list;
		
	}
	
	@RequestMapping("/responseMap")
	public @ResponseBody Map<String, Object> responseMap(@RequestBody Student student){
		System.out.println(student);
		List<Student>list = new ArrayList<Student>();
		Student stu1 = new Student("zhangsan", 20, "ÄÐ", "Çàµº");
		Student stu2 = new Student("lisi", 20, "ÄÐ", "Çàµº");
		Student stu3 = new Student("nalu", 20, "ÄÐ", "Çàµº");
		Student stu4 = new Student("mahu", 20, "ÄÐ", "Çàµº");
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("total", list.size());
		map.put("rows", list);
		return map;
		
	}
}
