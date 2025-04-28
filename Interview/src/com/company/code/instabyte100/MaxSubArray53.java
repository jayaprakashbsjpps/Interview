package com.jayaprakash.instabyte100;

public class MaxSubArray53 {

    public static void main(String[] args) {

        int[] nums={2,3,-8,7,-1,2,3};

        System.out.println(maxSubArray(nums));
    }

    public static  int maxSubArray(int[] nums) {

        int currentSum=nums[0];
        int maxSum=nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i],currentSum+nums[i]);

            maxSum = Math.max(currentSum,maxSum);

        }

        return maxSum;
    }
}
