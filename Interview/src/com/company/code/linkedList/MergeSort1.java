package com.jayaprakash.linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort1 {

    public static void main(String[] args) {

        int[] nums={5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(nums)));

    }

    static int[] mergeSort(int[] nums) {


        int mid= nums.length/2;

        if(nums.length==1) {
            return nums;
        }

        int[] left = mergeSort(Arrays.copyOfRange(nums,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(left,right);

    }

    private static int[] merge(int[] left, int[] right) {

        int[] arr = new int[left.length + right.length];

        int i=0,j=0;
        int k=0;
        while(i<left.length && j< right.length) {

            if(left[i]<=right[j]) {

                arr[k] = left[i];
                i++;
            } else {
                arr[k]=right[j];
                j++;
            }
            k++;
        }

        if(i<left.length) {

            System.arraycopy(left,i,arr,k,left.length-i);
        }

        if(j<right.length) {

            System.arraycopy(right,j,arr,k,right.length-j);
        }

//        while(i<left.length) {
//
//            arr[k]=left[i];
//            i++;
//            k++;
//
//        }
//
//        while(j< right.length) {
//
//            arr[k]=right[j];
//            j++;
//            k++;
//        }

        return arr;
    }
}
