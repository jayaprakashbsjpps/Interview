package com.jayaprakash.overloading;

import java.util.Arrays;

public class Overloading {

    public static void main(String[] args) {

        fun(5);
        fun("Jp1");
        fun(2,4,5,6);
    }

    public static void fun(int a) {

        System.out.println(a);
    }

    public static void fun(String a) {
        System.out.println(a);
    }

    public static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }




}
