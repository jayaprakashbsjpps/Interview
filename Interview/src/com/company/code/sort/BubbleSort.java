package com.jayaprakash.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums={-1,7,-32};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums) {
        boolean swapped;

        for (int i = 0; i <= nums.length-1; i++) {
            swapped=false;
            for (int j = 1; j <= (nums.length-1)-i; j++) {

                if(nums[j-1]>nums[j]) {
                    swap(nums,j-1,j);
                    swapped=true;
                }


            }

            if(!swapped) {
                break;
            }

        }
    }

    static void swap(int[] nums, int i,int j) {

        int temp = nums[i];

        nums[i]= nums[j];

        nums[j]= temp;
    }
}
