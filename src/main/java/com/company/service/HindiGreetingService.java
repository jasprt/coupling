package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HindiGreetingService implements GreetingService{

    @Autowired
    HindiGreetingService(@Qualifier("timeService12HourFormat") TimeService timeService) {
        this.timeService = timeService;
    }

    private TimeService timeService;

    @Override
    public void greet(String name) {
        System.out.print("Hello " + name + "!");
    }

    @Override
    public TimeService getTimeService() {
        return timeService;
    }
}
