package com.jayaprakash.sort;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        int[] nums={3,5,2,1,4};

        sort(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {

        int i=0;
        while(i<=nums.length-1) {

            if(nums[i]!=i+1) {

                swap(nums,i,nums[i]-1);
            } else {

                i++;
            }
        }



    }

    public static void swap(int[] nums,int i,int j) {

        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]= temp;
    }
}
