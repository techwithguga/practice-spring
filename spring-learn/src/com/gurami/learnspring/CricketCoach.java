package com.gurami.learnspring;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields for emalAddress and team
	private String emailAddress;
	private String team;
	
	
	//Create a no-arg constructor
	public CricketCoach() {
		System.out.println("ChricketCoach: inside constructor testing");
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		
		System.out.println("ChricketCoach: inside the setter methor - setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("ChricketCoach: inside the setter methor - setTeam");
		this.team = team;
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("ChricketCoach: inside the setter methor - setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
