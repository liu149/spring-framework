package com.lq.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

//	@RequestMapping("/h")
//	public String hello(){
//		return "hello";
//	}

	@GetMapping("/page")
	public ModelAndView page(){
		ModelAndView mv = new ModelAndView("page");
		return mv;
	}

}
