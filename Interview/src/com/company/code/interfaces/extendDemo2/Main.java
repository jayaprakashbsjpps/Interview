package com.jayaprakash.interfaces.extendDemo2;


public class Main implements  A, B {
    @Override
    public void greet() {

    }


    @Override
    public void fun() {
        A.super.fun();
    }
}
