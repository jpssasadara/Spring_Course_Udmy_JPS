package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	//reference for aggrigation relationship 
	private FortuneService fortuneService;
	
	//add new fields for email address and team
	private String emailAddress;
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach : inside setter message set email address");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket coach inside the setter method set team");
		this.team = team;
	}

	private String team;
	
    //our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("fixing setter method on setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "All the team member should play";
	}

	@Override
	public String getDailyFortune() {
		// let's call the method of foutuneService class
		return fortuneService.getFortune();
	}

}
