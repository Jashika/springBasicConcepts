package com.learning;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req){
	int i=Integer.parseInt(req.getParameter("j1"));
	int j=Integer.parseInt(req.getParameter("j2"));
	ModelAndView mv = new ModelAndView();
	mv.setViewName("display.jsp");
	System.out.println(i+j);
	mv.addObject("result",i+j);
		return mv;
	}

}
