package com.jayaprakash.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double length, double height, double breadth, double weight) {
        super(length, height, breadth);
        System.out.println(super.length);
        this.weight = weight;
    }
    //@Override
    static void greeting() {
        System.out.println("Hey I am in a box weight!!");
    }
}
