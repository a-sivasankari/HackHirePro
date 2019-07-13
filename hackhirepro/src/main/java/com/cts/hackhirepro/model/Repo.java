package com.cts.hackhirepro.model;



import lombok.Data;


@Data
public class Repo {
	
	Integer openPRCount;
	
	Integer closedPRToday;
	
	Integer openPRComments;
	
	Integer commits;
	
	Integer committers;
	
	Integer topCommitters;
	

}
