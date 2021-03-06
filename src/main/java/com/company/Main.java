package com.company;

import com.company.service.greetingService.EnglishGreetingService;
import com.company.service.greetingService.FrenchGreetingService;
import com.company.service.greetingService.SpanishGreetingService;
import com.company.service.greetingService.HindiGreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    final static String GREETING_NAME = "Jasprt";

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.company.service");

        EnglishGreetingService englishGreetingService = (EnglishGreetingService) applicationContext.getBean("englishGreetingService");
        englishGreetingService.greet(GREETING_NAME);
        System.out.println(" Hour: " + englishGreetingService.getTimeService().getCurrentTime());

        FrenchGreetingService frenchGreetingService = (FrenchGreetingService) applicationContext.getBean("frenchGreetingService");
        frenchGreetingService.greet(GREETING_NAME);
        System.out.println(" Hour: " + frenchGreetingService.getTimeService().getCurrentTime());

        SpanishGreetingService spanishGreetingService = (SpanishGreetingService) applicationContext.getBean("spanishGreetingService");
        spanishGreetingService.greet(GREETING_NAME);
        System.out.println(" Hour: " + spanishGreetingService.getTimeService().getCurrentTime());

        HindiGreetingService hindiGreetingService = (HindiGreetingService) applicationContext.getBean("hindiGreetingService");
        hindiGreetingService.greet(GREETING_NAME);
        System.out.println(" Hour: " + hindiGreetingService.getTimeService().getCurrentTime());

    }
}
