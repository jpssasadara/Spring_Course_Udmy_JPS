package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coach thecoach = new BaseballCoach();
		Coach thetrackcoach = new TrackCoach();
		System.out.println(thecoach.getDailyWorkout());

	}

}
