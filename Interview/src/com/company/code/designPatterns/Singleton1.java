package com.jayaprakash.designPatterns;

public class Singleton1 {

    private static Singleton1 single_instance=null;

    public String s;

    private Singleton1() {
        s="Hello I am a string part of Singleton class";
    }

    public static Singleton1 getInstance() {

        if(single_instance==null) {
            single_instance = new Singleton1();
        }
        return single_instance;
    }
}
