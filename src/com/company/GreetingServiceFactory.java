package com.company;

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
