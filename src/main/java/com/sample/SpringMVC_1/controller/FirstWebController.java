package com.sample.SpringMVC_1.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstWebController {
	
	@RequestMapping("/home")
	public ModelAndView controller1() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "Welcome to home page");
		mv.setViewName("welcome");
		return mv;
	}
	

	@GetMapping("/")
	public String displayMessage(Model model)    // behind the scene spring injects the implementation of Model the implementing class is BindingAwareModelMap
	{
	model.addAttribute("name", "Welcome to our page");

	return "welcome";   //jsp file name should be welcome.jsp
	}

@RequestMapping("/about")
public ModelAndView controller2() {
	ModelAndView mv = new ModelAndView();
	mv.addObject("name", "Welcome to about section");
	mv.setViewName("welcome");
	return mv;
}

@RequestMapping("/contact")
public String controller3(Map<String, Object> mv) {
	mv.put("name", "Welcome to contact page ph:00-1432-555");
	return "welcome";
}

}
	

