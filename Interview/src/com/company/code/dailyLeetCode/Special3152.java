package com.jayaprakash.dailyLeetCode;

import java.util.Arrays;

public class Special3152 {
    public static void main(String[] args) {

        //int[] nums={3,4,1,2,6};
        //int[] nums={4,5,2,7};
        int[] nums={4,3,1,6};
        int[][] queries={{0,2},{2,3}};
        //int[][] queries={{1,3}};

        System.out.println(Arrays.toString(isArraySpecial(nums,queries)));

    }

    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n= nums.length;
        int[] prefix=new int[n];
        boolean[] result = new boolean[queries.length];

        for (int i = 1; i <n; i++) {
            prefix[i]=prefix[i-1];
            if((nums[i-1]%2==0 && nums[i]%2==0) ||(nums[i-1]%2!=0 && nums[i]%2!=0)) {
                prefix[i]++;
            }
        }

        int count=0;
        for(int[] query:queries ) {
            int left=query[0];
            int right =query[1];
            int special = prefix[right] - (left>0?prefix[left]:0);
            result[count]=(special==0);
        }

        return result;

    }

    public static boolean isSpecial(int[] nums, int low,int high) {

        for(int i=low;i<high;i++) {
                int first = nums[i];
                int second = nums[i+1];
                if((first%2==0 && second%2==0) || (first%2!=0 && second%2!=0)) {
                    return false;
                }
        }

        return true;
    }
}
