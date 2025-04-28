package com.jayaprakash.designPatterns;

public class Singleton2 {
    private Singleton2() {}

    public static class SingletonHelper {
        private static final Singleton2  INSTANCE= new Singleton2();
    }

    public static Singleton2 getInstance() {
        return SingletonHelper.INSTANCE;
    }

}
