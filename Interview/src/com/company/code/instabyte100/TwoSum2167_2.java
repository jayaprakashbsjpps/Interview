package com.jayaprakash.instabyte100;

import java.util.Arrays;

public class TwoSum2167_2 {

    public static void main(String[] args) {

        int[] numbers={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(numbers,9)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int i=0;
        int j=nums.length-1;

        while(i<j) {

            int sum = nums[i]+nums[j];
            if(sum==target) {
                return new int[] {i+1,j+1};
            } else if(sum<target) {
                i++;
            } else {
                j--;
            }

        }
        return new int[0];
    }
}
