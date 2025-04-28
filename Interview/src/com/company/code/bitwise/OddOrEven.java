package com.jayaprakash.bitwise;

public class OddOrEven {

    public static void main(String[] args) {

        int a = 68;

        System.out.println(isOdd(a));
    }

    private static boolean isOdd(int a) {

        return (a & 1)==1;
    }
}
