package com.jayaprakash.recursion;

public class FactorialOfNumber {

    public static void main(String[] args) {

        System.out.println(factorial(5));

    }

    static int factorial(int n) {

        if(n==1) {

            return 1;
        }

        return n*factorial(n-1);
    }

}
