package com.company;

public class SpanishGreetingService implements GreetingService {

    @Override
    public void greet(String name) {
        System.out.println("Hola " + name);
    }
}
