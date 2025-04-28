package com.jayaprakash.abstractDemo;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello() {
        System.out.println("Hey ");
    }

    void normal() {
        System.out.println("I am normal boy");
    }

    abstract void carrer();
    abstract void partner();
}
