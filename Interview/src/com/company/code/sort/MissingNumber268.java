package com.jayaprakash.sort;

import java.util.Arrays;

public class MissingNumber268 {

    public static void main(String[] args) {

        //int[] nums={3,0,1};
        //int[] nums={0,1};
        int[] nums={1,2};
        //int[] nums={9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(nums));

    }
    public static int missingNumber(int[] nums) {

        int i=0;
        int n= nums.length;

        while(i<n) {

            if(nums[i] < n && nums[i]!=i) {

                swap(nums,i,nums[i]);

            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
        for(int j=0;j<=nums.length-1;j++) {

            if(j!=nums[j]) {
                return j;
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
