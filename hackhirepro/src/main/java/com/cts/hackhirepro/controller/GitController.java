package com.cts.hackhirepro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/git")
public class GitController {
	
	  @GetMapping(value="/login")
	    public String showLoginPage(ModelMap model){
	        return "login";
	    }
}
