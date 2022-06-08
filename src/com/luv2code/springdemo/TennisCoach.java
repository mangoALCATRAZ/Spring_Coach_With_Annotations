package com.luv2code.springdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public void TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

    /*
    @Autowired
    public void doSomeCrazyStuff(FortuneService theFortuneService){
        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
        fortuneService = theFortuneService;
    }
    */


    @Autowired
    @Qualifier("fileFortuneService")
    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "get a tetnus shot";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
