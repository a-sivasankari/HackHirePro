package com.cts.hackhirepro.controller;

import com.cts.hackhirepro.response.RepoResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/git")
public class GitController {



	final String GET_USER_REPOS="http://api.github.com/users/";

	@Autowired
	private RestTemplate restTemplate;
	@GetMapping(value="/login/{user}")
	public void getUserRepos(@PathVariable String username)
	{
		if(username!=null)
		{
			HttpHeaders header =  new HttpHeaders();
			header.set("User-agent", username);
			String userRepoURl= GET_USER_REPOS+username+"repos/";
			HttpEntity<String> request = new HttpEntity<String>(header);
			ResponseEntity<RepoResponse> reposResp = restTemplate.exchange(userRepoURl, HttpMethod.GET,request, RepoResponse.class);
			reposResp.getStatusCode();

		}
	}

	@GetMapping(value="/login")
	public String showLoginPage(ModelMap model){
		return "login";
	}



}
