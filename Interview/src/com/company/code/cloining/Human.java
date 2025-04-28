package com.jayaprakash.cloining;

public class Human implements Cloneable {

    int age;
    String name;
    int[] arr;


    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;

    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr   = new int[] {3,5,6,7,8};
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
