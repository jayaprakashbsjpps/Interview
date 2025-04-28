package com.jayaprakash.linkedList;

import java.util.LinkedList;

public class LL202 {

    public static void main(String[] args) {

        System.out.println(isHappy(3));

    }
    public static  boolean isHappy(int n) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        int initValue= findSumOfDigits(n);

        if(linkedList.isEmpty()) {
            linkedList.addLast(initValue);
        }
        int squareOfDigit= findSumOfDigits(linkedList.getLast());
        while(squareOfDigit!=1) {
            squareOfDigit= findSumOfDigits(linkedList.getLast());
            if(squareOfDigit==initValue || linkedList.contains(squareOfDigit)) {
                linkedList.addLast(squareOfDigit);
                return false;
            }
            linkedList.addLast(squareOfDigit);
        }

        return true;
    }

    public static  int findSumOfDigits(int n) {

        int sumOfDigits=0;
        int ans=0;

        while(n!=0) {

            int rem= n%10;
            sumOfDigits+= rem * rem;
            n/=10;
        }

        return sumOfDigits;

    }
}
