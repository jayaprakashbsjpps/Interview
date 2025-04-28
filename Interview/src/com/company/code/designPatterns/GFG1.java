package com.jayaprakash.designPatterns;

public class GFG1 {

    private static volatile GFG1 instance;

    private GFG1() {

    }

    public static GFG1 getInstance() {

        if(instance==null) {

            synchronized (GFG1.class) {
                if(instance==null) {
                    instance = new GFG1();
                }
            }
        }

        return instance;
    }
}
