package com.jayaprakash.recursion;

public class NoOfSteps {

    public static int numberOfSteps(int num) {

        return helper(num,0);

    }

    static int helper(int num, int count) {

        if(num==0) {
            return count;
        }
        if((num & 1)==0) {

            return helper(num/2,++count);
        }

        return helper(num -1,++count);

    }

    public static void main(String[] args) {

        System.out.println(numberOfSteps(14));
    }
}
