package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	private static final Log logger = LogFactory.getLog(HelloController.class);
	
	@RequestMapping(value="/hello")
	public ModelAndView hello() {
		logger.info("hello()被调用");
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello World!");
		mv.setViewName("/WEB-INF/content/welcome.jsp");
		
		return mv;
	}
}
