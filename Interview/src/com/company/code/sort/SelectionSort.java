package com.jayaprakash.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] nums={2,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums) {
        boolean swapped;

        for (int i = 0; i <= nums.length-1; i++) {

            int maxIndex= getMaxIndex(nums,0,nums.length-1-i);

            swap(nums,maxIndex,nums.length-1-i);
        }

    }

    private static int getMaxIndex(int[] nums, int start, int last) {

        int max = 0;

        for(int i=start;i<=last;i++) {

            if(nums[i] > nums[max]) {

                max=i;
            }
        }

        return max;
    }

    static void swap(int[] nums, int i,int j) {

        int temp = nums[i];

        nums[i]= nums[j];

        nums[j]= temp;
    }
}
