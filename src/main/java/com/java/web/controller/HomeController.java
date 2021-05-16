package com.java.web.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    Logger log = Logger.getLogger(HomeController.class.getName());
    
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcomePage() {
        log.info("INTO welcomePage");
        return "welcome";
    }
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        log.info("INTO index");
        return "index";
    }
//    @RequestMapping(value = "/student", method = RequestMethod.GET)				 // method.... :len quan den phan lay danh sach len, hien len sau do xem  tra ve view nao
//	public ModelAndView student() { 												//ModelAndView:, model chua all list day du lieu. view trang dinh nghia trong view 
//		ModelAndView modelAndView = new ModelAndView("student");
//		return modelAndView;
//	}
}