package com.jayaprakash.abstractDemo;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void carrer() {
        System.out.println("I want to be an Engineer");
    }

    @Override
    void partner() {
        System.out.println("Inside daughter ");
    }
}
