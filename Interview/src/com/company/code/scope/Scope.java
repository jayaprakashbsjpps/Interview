package com.jayaprakash.scope;

public class Scope {

    public static void main(String[] args) {

        int a =10;
        int b = 20;
        String name = "Kunal";

        {
            a = 50;
            int c = 99;
            name="JP";
        }

        System.out.println(a);
        System.out.println(name);


    }
}
