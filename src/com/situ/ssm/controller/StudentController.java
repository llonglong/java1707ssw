package com.situ.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.ssm.dao.BanjiDao;
import com.situ.ssm.pojo.Banji;
import com.situ.ssm.pojo.Student;
import com.situ.ssm.service.IBanjiService;
import com.situ.ssm.service.IStudentService;
import com.situ.ssm.service.impl.BanjiServiceImpl;

@Controller
@RequestMapping(value="/student")

public class StudentController {
	@Resource(name="studentService")
	private IStudentService studentService;
	
	@Resource(name="banjiService")
	private IBanjiService banjiService;
	
	@RequestMapping(value="/list")
	public String list(Model model) {
		List<Student> list = studentService.findAll();
		model.addAttribute("list",list);
		for (Student student : list) {
			System.out.println(student);
		}
		return "student_list";
		
	}
	
	
	@RequestMapping(value="/deleteById")
	public String deleteById(int id) {
		studentService.deleteById(id);
		return "redirect:/student/list.action";
		
	}
	
	
	@RequestMapping(value="/add")
	public String add(Model model,Student student) {
		studentService.add(student);
		return "redirect:/student/list.action";
		
	}
	
	@RequestMapping(value="/findById")
	public String findById(Model model,int id) {
		Student student = studentService.findById(id);
		model.addAttribute("student",student);
		List<Banji> list = banjiService.findAll();
		model.addAttribute("list",list);
		/*Banji banji = student.getBanji();
		System.out.println(banji);*/
		return "student_update";
		
	}
	
	@RequestMapping(value="/update")
	public String update(Student student) {
		studentService.update(student);
		return "redirect:/student/list.action";
		
	}
	
	@RequestMapping(value="/getTurn")
	public String getTurn(Model model) {
		List<Banji> list = banjiService.findAll();
		model.addAttribute("list",list);
		return "add_student";	
	}
	
	@RequestMapping(value="/findByCondition")
	public String findByCondition(Model model,Student student) {
		List<Student> list = studentService.findByCondition(student);
		model.addAttribute("list",list);
		for (Student stu : list) {
			System.out.println(stu);
		}
		return "student_finded";
		
	}
	
	@RequestMapping(value="/findBanjiCourseInfo")
	public String findBanjiCourseInfo(Model model) {
		List<Student> list = studentService.findBanjiCourseInfo();
		model.addAttribute("list",list);
		for (Student stu : list) {
			System.out.println(stu);
		}
		return "studentBanjiCourse_list";
		
	}
	
	@RequestMapping(value="/findBanjiCourse")
	public void findBanjiCourse(Model model) {
		List<Student> list = studentService.findBanjiCourse();
		model.addAttribute("list",list);
		for (Student stu : list) {
			System.out.println(stu);
		}
		/*return "banjiCourse_list";*/
		
	}
	
	
	
	
	
}
