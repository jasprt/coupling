package com.company.service.greetingService;

import com.company.service.timeService.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SpanishGreetingService implements GreetingService {

    @Autowired
    public SpanishGreetingService(@Qualifier("timeService24HourFormat") TimeService timeService) {
        this.timeService = timeService;
    }

    private TimeService timeService;

    @Override
    public void greet(String name) {
        System.out.print("Hola " + name + "!");
    }

    @Override
    public TimeService getTimeService() {
        return timeService;
    }
}