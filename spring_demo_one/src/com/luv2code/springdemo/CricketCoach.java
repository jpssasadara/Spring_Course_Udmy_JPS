package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	//reference for aggrigation relationship 
	private FortuneService fortuneService;
	
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
