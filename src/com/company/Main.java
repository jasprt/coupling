package com.company;

public class Main {

    public static void main(String[] args) {
        GreetingServiceFactory gsf = new GreetingServiceFactory();
        GreetingService gs = gsf.getGreetingService("french");
        gs.greet("Mani");
    }
}
