package com.situ.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.ssm.pojo.Banji;
import com.situ.ssm.pojo.BanjiCourse;
import com.situ.ssm.pojo.Course;
import com.situ.ssm.service.IBanjiCourseService;
import com.situ.ssm.service.IBanjiService;
import com.situ.ssm.service.ICourseService;

@Controller
@RequestMapping(value="/banjiCourse")
public class BanjiCourseController {
	@Resource(name="banjiCourseService")
	private IBanjiCourseService banjiCourseService;
	@Resource(name="courseService")
	private ICourseService courseService;
	@Resource(name="banjiService")
	private IBanjiService banjiService;
	
	@RequestMapping(value="/findBanjiCourse")
	public String findBanjiCourse(Model model) {
		List<BanjiCourse> list = banjiCourseService.findByCondition();
		model.addAttribute("list",list);
		for (BanjiCourse banjiCourse : list) {
			System.out.println(banjiCourse);
		}
		return "banjiCourse_list";
		
	}
	
	@RequestMapping(value="/deleteById")
	public String deleteById(int id) {
		banjiCourseService.deleteById(id);
		
		return "redirect:/banjiCourse/findBanjiCourse.action";
		
	}
	
	@RequestMapping(value="/banjiAddCourse")
	public String banjiAddCourse(Model model) {
		List<Banji> banjiList = banjiService.findAll();
		model.addAttribute("banjiList",banjiList);
		List<Course> courseList = courseService.findAll();
		model.addAttribute("courseList",courseList);
		return "banjiAddCourse";
		
	}
	
	@RequestMapping(value="/add")
	public String add(int banjiId,int courseId) {
		banjiCourseService.add(banjiId,courseId);
		return "redirect:/banjiCourse/findBanjiCourse.action";
		
	}

}
