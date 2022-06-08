package com.luv2code.springdemo;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "luck-y day for-a you!!";
    }
}
