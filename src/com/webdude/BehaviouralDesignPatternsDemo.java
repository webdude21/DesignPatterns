package com.webdude;

import behavioural.chainofreponsibility.ChainOfResponsibilityDemonstrator;
import behavioural.observer.ObserverDeomonstrator;
import behavioural.strategy.StrategyDemonstrator;
import behavioural.templatemethod.PizzaPlace;

import java.util.ArrayList;
import java.util.List;

public class BehaviouralDesignPatternsDemo {

    public static void main(String[] args) {
        List<Demonstrator> demonstratorList = new ArrayList<>();

        demonstratorList.add(new ChainOfResponsibilityDemonstrator());
        demonstratorList.add(new PizzaPlace());
        demonstratorList.add(new StrategyDemonstrator());
        demonstratorList.add(new ObserverDeomonstrator());

        demonstratorList.forEach(Demonstrator::demonstrate);
    }
}
