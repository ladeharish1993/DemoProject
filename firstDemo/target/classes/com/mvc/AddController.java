package com.mvc;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		ModelAndView mv=new ModelAndView();
		mv.setView("display.jsp");
		mv.addObject("result",k);
		return mv;
	}

}
