package com.company;

public class FrenchGreetingService implements GreetingService {

    @Override
    public void greet(String name) {
        System.out.println("Bonjour " + name);
    }
}
