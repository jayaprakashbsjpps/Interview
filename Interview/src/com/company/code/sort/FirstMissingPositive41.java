package com.jayaprakash.sort;

import java.util.Arrays;

//https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPositive41 {

    public static void main(String[] args) {

        //int[] nums={1,2,0};
        //int[] nums={3,4,-1,1};
        int[] nums={7,8,9,11,12};

        String name="Jaya";

        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {


        int i=0;
        int n= nums.length;

        while(i<n) {

            int correctIndex= nums[i]-1;
            if(nums[i] > 0 && nums[i]<=nums.length && nums[i]!=nums[correctIndex]) {

                swap(nums,i,correctIndex);

            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
        int j;
        for(j=0;j<=nums.length-1;j++) {

            if(nums[j]!=j) {
                return j+1;
            }
        }

        return n;
    }


    public static void swap(int[] nums,int i,int j) {

        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]= temp;
    }
}
