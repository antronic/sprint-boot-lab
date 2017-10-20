package com.jirachai.app.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	ControllerAspect controllerAspect;
	
	@RequestMapping("/")
	public ModelAndView home(ModelAndView modelAndView){
		
		modelAndView.setViewName("home/home");
		return modelAndView;
	}
}

