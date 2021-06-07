package com.company;

import com.company.service.EnglishGreetingService;
import com.company.service.GreetingService;
import com.company.service.SpanishGreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        GreetingServiceFactory gsf = new GreetingServiceFactory();
        //Select english/spanish/french
        GreetingService gs = gsf.getGreetingService("french");
        gs.greet("jasprt");
        System.out.println("\n###############################################");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.company.service");
        EnglishGreetingService englishGreetingService = (EnglishGreetingService) applicationContext.getBean("englishGreetingService");
        englishGreetingService.greet("jasprt");
        System.out.println(" Hour: "+englishGreetingService.getTimeService().getCurrentTime());

        SpanishGreetingService spanishGreetingService = (SpanishGreetingService) applicationContext.getBean("spanishGreetingService");
        spanishGreetingService.greet("jasprt");
        System.out.println(" Hour: "+spanishGreetingService.getTimeService().getCurrentTime());

    }
}
