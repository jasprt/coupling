package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FrenchGreetingService implements GreetingService {

    @Autowired
    FrenchGreetingService(@Qualifier("timeService24HourFormat") TimeService timeService) {
        this.timeService = timeService;
    }

    private TimeService timeService;

    @Override
    public void greet(String name) {
        System.out.print("Bonjour " + name + "!");
    }

    @Override
    public TimeService getTimeService() {
        return timeService;
    }
}
