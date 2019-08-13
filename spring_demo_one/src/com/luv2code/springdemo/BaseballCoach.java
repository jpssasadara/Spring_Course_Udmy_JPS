package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	//define a constructor for dependency injection 
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	//on arg constructor
	public BaseballCoach() {
		
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return  "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
