package com.jayaprakash.recursion;

public class CountZeros {

    public static void main(String[] args) {
        int n=3030080;

        System.out.println(countZero(n,0));
    }

    static int countZero(int n, int count) {

        if(n/10==0) {
            return count;
        }

        if(n%10==0) {

            return countZero(n/10,++count);
        } else {

           return countZero(n/10,count);
        }

    }
}
