package com.jayaprakash.inheritance;

 public class Box {

     double length;
    double breadth;
    double height;

    Box() {
        super();
        this.length=-1;
        this.breadth = -1;
        this.height = -1;
    }

    //cube
    Box(double side) {
        this.length=side;
        this.breadth = side;
        this.height = side;
    }

    Box(double length, double height,double breadth) {
        System.out.println("Parent class constructor");
        this.length=length;
        this.breadth = breadth;
        this.height = height;

    }

    static void greeting() {
        System.out.println("Hey I am in a box!!");
    }
    Box(Box old) {
        this.height = old.height;
        this.breadth = old.breadth;
        this.length = old.length;
    }
}
