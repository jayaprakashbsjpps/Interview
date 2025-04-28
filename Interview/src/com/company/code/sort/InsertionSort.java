package com.jayaprakash.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] nums= {0,-23,-50};

        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {

        for (int i = 0; i <= nums.length-1-1; i++) {

            for (int j = i+1; j >0; j--) {

                if(nums[j] < nums[j-1]) {
                    swap(nums,j-1,j);

                }
                else {
                    break;
                }

            }
        }

    }

    static void swap(int[] nums, int i,int j) {

        int temp = nums[i];

        nums[i]= nums[j];

        nums[j]= temp;
    }
}
