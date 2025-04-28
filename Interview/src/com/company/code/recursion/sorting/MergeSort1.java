package com.jayaprakash.recursion.sorting;

import java.util.Arrays;

public class MergeSort1 {

    public static void main(String[] args) {

        int[] nums={5,4,3,2,1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int[] sortArray(int[] nums) {

        if(nums.length==1) {
            return nums;
        }

        int mid = nums.length/2;

        int[] left = sortArray(Arrays.copyOfRange(nums,0,mid));
        int[] right = sortArray(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(left,right);
    }

    public static int[] merge(int[] left,int[] right) {

        int[] mix = new int[left.length+ right.length];

        int i=0;
        int j=0;
        int k=0;

        while(i< left.length && j< right.length) {

            if(left[i]<=right[j]) {
                mix[k]=left[i];
                i++;
            } else {
                mix[k]=right[j];
                j++;
            }
            k++;

        }

        while(i<left.length) {
            mix[k]=left[i];
            i++;
            k++;
        }

        while(j<right.length) {
            mix[k]=right[j];
            j++;
            k++;
        }

        return mix;
    }

}
