package com.company.service.greetingService;

import com.company.service.timeService.TimeService;

public interface GreetingService {
    void greet(String name);

    TimeService getTimeService();
}
