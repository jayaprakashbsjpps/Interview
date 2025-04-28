package com.jayaprakash.stack;

import java.util.Arrays;
import java.util.List;

public class TwoStackHacker {

    public static void main(String[] args) {

        List<Integer> a= Arrays.asList(4 ,2, 4, 6, 1);
        List<Integer> b= Arrays.asList(2 ,1, 8,5);

        System.out.println(twoStacks(10,a,b));

    }


    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        // Write your code here
        return twoStacks(maxSum,a,b,0,0) -1;
    }

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b,int sum, int count) {
        if(sum > maxSum) {
            return count;
        }

        if(a.size()==0 || b.size()==0) {
            return count;
        }

        int ans1 = twoStacks(maxSum,a.subList(1,a.size()),b,sum+a.get(0),count+1);
        int ans2 = twoStacks(maxSum,a,b.subList(1,b.size()),sum+b.get(0),count+1);

        return Math.max(ans1,ans2);

    }
}
