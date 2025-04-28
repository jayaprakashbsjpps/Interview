package com.jayaprakash.compare;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();

        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }

        arr.forEach(item-> System.out.println(item * 2));

        Consumer<Integer> fun = item -> System.out.println(item * 2);
        arr.forEach(fun);

        Operation sum = (a,b) -> a+b;
        Operation multiply = (a,b) -> a*b;

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(5,6,sum));

    }

    private int operate(int a, int b, Operation op) {

        return op.Operation(a,b);
    }
}


interface Operation {
    int Operation(int a, int b);
}