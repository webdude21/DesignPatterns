package com.webdude;

import creational.builder.BuilderDemonstrator;
import creational.factory.FactoryDemonstrator;

import java.util.ArrayList;
import java.util.List;

public class CreationalDesignPatternsDemo {

    public static void main(String[] args) {
        List<Demonstrator> demonstratorList = new ArrayList<>();
        demonstratorList.add(new BuilderDemonstrator());
        demonstratorList.add(new FactoryDemonstrator());
        demonstratorList.forEach(Demonstrator::demonstrate);
    }
}
