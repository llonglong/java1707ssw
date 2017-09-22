package com.situ.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.ssm.pojo.Banji;
import com.situ.ssm.pojo.BanjiCourse;
import com.situ.ssm.pojo.Student;
import com.situ.ssm.service.IBanjiCourseService;
import com.situ.ssm.service.IBanjiService;

@Controller
@RequestMapping(value="/banji")
public class BanjiController {
	@Resource(name="banjiService")
	private IBanjiService banjiService;
	@Resource(name="banjiCourseService")
	private IBanjiCourseService banjiCourseService;
	
	@RequestMapping(value="/list")
	public String list(Model model) {
		List<Banji> list = banjiService.findAll();
		model.addAttribute("list",list);
		for (Banji banji : list) {
			System.out.println(banji);
		}
		return "add_student";
		
	}
	
	/*@RequestMapping(value="/findBanjiCourse")
	public String findBanjiCourse(Model model) {
		List<Banji> list = banjiService.findBanjiCourse();
		model.addAttribute("list",list);
		BanjiCourse banjiCourse = banjiCourseService.findByCondition();
		for (Banji banji : list) {
			System.out.println(banji);
		}
		System.out.println(banjiCourse);
		return "banjiCourse_list";
		
	}*/
	
	@RequestMapping(value="/deleteById")
	public String deleteById(int id) {
		banjiService.deleteById(id);
		return "redirect:/banji/findBanjiCourse.action";
		
	}
}
