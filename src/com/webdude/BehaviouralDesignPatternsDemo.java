package com.webdude;

import behavioural.chainofreponsibility.ChainOfResponsibilityDemonstrator;
import behavioural.templatemethod.PizzaPlace;

import java.util.ArrayList;
import java.util.List;

public class BehaviouralDesignPatternsDemo {

    public static void main(String[] args) {
        List<Demonstrator> demonstratorList = new ArrayList<>();

        demonstratorList.add(new ChainOfResponsibilityDemonstrator());
        demonstratorList.add(new PizzaPlace());

        demonstratorList.forEach(Demonstrator::demonstrate);
    }
}
