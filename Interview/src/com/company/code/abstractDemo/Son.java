package com.jayaprakash.abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void carrer() {
        System.out.println("I am going to be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love batman inside son");

    }


}
