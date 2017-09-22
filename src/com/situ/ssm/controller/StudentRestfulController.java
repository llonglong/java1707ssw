package com.situ.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.ssm.pojo.Student;
import com.situ.ssm.service.IStudentService;

@Controller
public class StudentRestfulController {
	@Resource(name="studentService")
	private IStudentService studentService;
	
	@RequestMapping(value="/stus/",method=RequestMethod.GET)
	public @ResponseBody List<Student> findAll() {
		List<Student> list = studentService.findAll();
		for (Student student : list) {
			System.out.println(student);
		}
		return list;
		
	}
	
	
	
}
