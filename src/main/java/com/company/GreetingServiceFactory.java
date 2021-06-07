package com.company;

import com.company.service.EnglishGreetingService;
import com.company.service.FrenchGreetingService;
import com.company.service.GreetingService;
import com.company.service.SpanishGreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceFactory {

    public GreetingService getGreetingService(String language) {
        if ("english".equalsIgnoreCase(language))
            return new EnglishGreetingService();
        else if ("french".equalsIgnoreCase(language))
            return new FrenchGreetingService();
        else if ("spanish".equalsIgnoreCase(language))
            return new SpanishGreetingService();
        else
            throw new RuntimeException("No greeting service exists for " + language + " language!");
    }
}
