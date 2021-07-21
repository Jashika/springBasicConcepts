package com.learning;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.learning.service.AddService;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("j1") int i,@RequestParam("j2") int j){
/*	int i=Integer.parseInt(req.getParameter("j1"));
	int j=Integer.parseInt(req.getParameter("j2"));*/
		AddService addition=new AddService();
	ModelAndView mv = new ModelAndView();
	mv.setViewName("display");
	mv.addObject("result",addition.add(i, j));
		return mv;
	}

}
