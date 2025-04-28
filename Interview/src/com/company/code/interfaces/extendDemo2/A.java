package com.jayaprakash.interfaces.extendDemo2;

public interface A {
    static void greetin() {

    }
    default void fun() {
        System.out.println("I am in A");
    }
}
