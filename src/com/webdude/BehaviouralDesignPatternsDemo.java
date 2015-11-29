package com.webdude;

import behavioural.chainofreponsibility.*;

import java.util.ArrayList;
import java.util.List;

public class BehaviouralDesignPatternsDemo {

    public static void main(String[] args) {
        List<Demonstrator> demonstratorList = new ArrayList<>();

        demonstratorList.add(new ChainOfResponsibilityDemonstrator());

        demonstratorList.forEach(Demonstrator::demonstrate);
    }
}
