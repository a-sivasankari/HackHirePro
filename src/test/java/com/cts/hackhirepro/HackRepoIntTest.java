package com.cts.hackhirepro;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.cts.hackhirepro.controller.GitController;
import com.cts.hackhirepro.service.GitService;

@RunWith(SpringRunner.class)
@WebMvcTest(GitController.class)
public class HackRepoIntTest {

	@Autowired
    private MockMvc mockMvc;
 
    @MockBean
    private GitService gitService;
    
    @Test
    public void getRepoDetails() throws Exception {
    	
    	mockMvc.perform(MockMvcRequestBuilders.get("/git/login")
    	        .accept(MediaType.APPLICATION_JSON))
    	                .andExpect(MockMvcResultMatchers.status().isOk());
    	
    }
    
    
}
