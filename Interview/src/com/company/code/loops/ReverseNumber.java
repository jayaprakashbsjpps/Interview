package com.jayaprakash.loops;

public class ReverseNumber {

    public static void main(String[] args) {

        long n = 23597;
        long rem =0;
        long reverseNumber=0;
        while(n> 0) {
            rem = n % 10;
            n = n/10;

            reverseNumber = (reverseNumber * 10) + rem;


        }

        System.out.println("Reverse of number "+reverseNumber);

    }
}
