package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpanishGreetingService implements GreetingService {

    @Autowired
    private TimeService24HourFormat timeService24HourFormat;

    @Override
    public void greet(String name) {
        System.out.print("Hola " + name+"!");
    }

    @Override
    public TimeService getTimeService() {
        return timeService24HourFormat;
    }
}