package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    private String emailAddress;
    private String team;
    private FortuneService fortuneService;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("inside setter method for setTeam.");
        this.team = team;
    }


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("inside setter method for EmailAddress.");
        this.emailAddress = emailAddress;
    }


    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor.");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("inside setter method for setFortuneService.");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
