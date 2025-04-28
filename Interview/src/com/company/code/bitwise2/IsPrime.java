package com.jayaprakash.bitwise2;

public class IsPrime {

    public static void main(String[] args) {

        int n=17;

        System.out.println(isPrime(n));

    }

    public static boolean isPrime(int n) {


        if(n<=1) {
            return false;
        }
        int m = (int)Math.sqrt(n);


        for (int i = 2; i <=m ; i++) {

            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
