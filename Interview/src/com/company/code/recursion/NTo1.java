package com.jayaprakash.recursion;

public class NTo1 {

    public static void main(String[] args) {

            //funRev(5);
            funBoth(5);
    }

    static void funRev(int n) {

        if(n==0) {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }

    static void funBoth(int n) {

        if(n==0) {
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
