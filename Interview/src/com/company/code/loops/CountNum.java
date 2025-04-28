package com.jayaprakash.loops;

import java.util.Scanner;

public class CountNum {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

        long n = 1385757879;
       // long n = 1355;
        int num = 7;
//
//        int count=0;
//        String numValue = String.valueOf(1385757879);
//
//        for (int i = 0; i < numValue.length(); i++) {
//
//            if(numValue.charAt(i)=='7') {
//                count++;
//            }
//
//        }
        long lastDigit = 0;
        int count = 0;
        while(n > 0) {

            lastDigit = n % 10;

            if(lastDigit == num) {
                count++;
            }
             n = n/10;

        }

        System.out.println("No of nums "+count);

    }
}
