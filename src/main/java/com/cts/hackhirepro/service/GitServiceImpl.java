package com.cts.hackhirepro.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.xml.ws.Response;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.hackhirepro.controller.RepoList;
import com.cts.hackhirepro.controller.RepoResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class GitServiceImpl implements GitService{
	
	@Autowired
	private RestTemplate restTemplate;
	
	final String GET_USER_REPOS="https://api.github.com/users/";

	@Override
	public int getRepoNames(String userName) {
		
		if(userName!=null)
		{
			HttpHeaders header =  new HttpHeaders();
			header.set("User-agent", userName);
			String userRepoURl= GET_USER_REPOS+userName+"/repos";
			HttpEntity<String> request = new HttpEntity<String>(header);
			ResponseEntity<String> reposResp = restTemplate.exchange(userRepoURl, HttpMethod.GET,request, String.class);
			
			
			ObjectMapper mapper = new ObjectMapper();
			String json = "[{\"name\":\"mkyong\", \"age\":37}, {\"name\":\"fong\", \"age\":38}]";
			
			try {
				RepoResponse[] pp1 = mapper.readValue(reposResp.getBody(), RepoResponse[].class);
				List<RepoResponse> ppl2 = Arrays.asList(mapper.readValue(reposResp.getBody(), RepoResponse[].class));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return 0;
	}
	
	

}
