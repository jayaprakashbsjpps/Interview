package com.jayaprakash.methods;

public class Swap {

    public static void main(String[] args) {

        int a = 10;
        int b =20;
        System.out.println("Value of a="+a+" b="+b);
        swap(a,b);
        String name = "Jayaprakash BS";

        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String name) {

        name = "Aarvi";

    }

    public static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a="+a+" b="+b);

    }
}
