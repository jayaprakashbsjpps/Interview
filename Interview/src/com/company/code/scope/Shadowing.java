package com.jayaprakash.scope;

public class Shadowing {

    static int x =5;
    public static void main(String[] args) {

        System.out.println(x);
        int x;

        x=40;
        System.out.println(x);
        fun();

    }

    private static void fun() {
        System.out.println(x);
    }
}
