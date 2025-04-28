package com.jayaprakash.arrays;

import java.util.Arrays;

public class RotateArray189 {

    public static void main(String[] args) {

        int[] nums={1,2};
        int k=3;

        rotate(nums,3);

    }

    public static void rotate(int[] nums, int k) {

        if(nums.length==1) {
            return;
        }
        int newEnd= k> nums.length ? k % nums.length:nums.length % k;
        int j=0;
        int[] result = new int[nums.length];
        for (int i = newEnd; i < nums.length; i++) {
            result[j++]=nums[i];
        }
        for(int i=0;i<newEnd;i++) {

            result[j++]=nums[i];

        }

        for(int i=0;i<result.length;i++) {

            nums[i]=result[i];

        }
    }

}
