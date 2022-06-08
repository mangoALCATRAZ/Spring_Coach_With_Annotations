package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "shuttlecock aaaaahahhahahahahahha cock";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
