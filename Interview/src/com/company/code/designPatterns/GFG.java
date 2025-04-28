package com.jayaprakash.designPatterns;

public class GFG {

    public static void main(String[] args) {

        Singleton1 x = Singleton1.getInstance();

        Singleton1 y = Singleton1.getInstance();

        Singleton1 z = Singleton1.getInstance();

        // Now  changing variable of instance x
        // via toUpperCase() method
        x.s = (x.s).toUpperCase();

        // Print and display commands
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        // Now again changing variable of instance z
        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);


    }
}
