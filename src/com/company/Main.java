package com.company;

public class Main {

    public static void main(String[] args) {
        GreetingServiceFactory gsf = new GreetingServiceFactory();
        //Select english/spanish/french
        GreetingService gs = gsf.getGreetingService("spanish");
        gs.greet("jasprt");
    }
}
