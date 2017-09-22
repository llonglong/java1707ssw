package com.situ.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.ssm.pojo.Course;
import com.situ.ssm.service.ICourseService;

@Controller
@RequestMapping(value="/course")
public class CourseController {
	@Resource(name="courseService")
	private ICourseService courseService;
	
	@RequestMapping(value="/findAll")
	public void list(Model model) {
		List<Course> list = courseService.findAll();
		model.addAttribute("list",list);
		for (Course course : list) {
			System.out.println(course);
		}
		/*return "add_student";*/
		
	}
	
	
}
