package com.cts.hackhirepro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.cts.hackhirepro.service.GitService;

@Controller
@RequestMapping("/git")
public class GitController {
	
	@Autowired
	private GitService gitService;
	
	  @GetMapping(value="/login")
	    public String showLoginPage(ModelMap model){
		  
		  List<String> repos = new ArrayList<String>();
				  repos.add("fsda");
				  repos.add("fsda");
		  model.addAttribute("repos", repos);
		  gitService.getRepoNames("a-sivasankari");
	        return "gitdetail";
	    }
	  
		
}
