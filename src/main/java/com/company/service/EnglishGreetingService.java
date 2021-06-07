package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreetingService implements GreetingService {

    @Autowired
    private TimeService12HourFormat timeService12HourFormat;

    @Override
    public void greet(String name) {
        System.out.print("Hello " + name+"!");
    }

    @Override
    public TimeService getTimeService() {
        return timeService12HourFormat;
    }
}
