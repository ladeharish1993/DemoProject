package com.mvc;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/")
	public void add(HttpServletRequest request,HttpServletResponse response) {
		
		System.out.println("Jenkins Deployment");
	}

}
