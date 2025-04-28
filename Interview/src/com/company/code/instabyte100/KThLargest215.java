package com.jayaprakash.instabyte100;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.stream.Collectors;

public class KThLargest215 {

    public static void main(String[] args) {

        int[] nums ={3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2));
    }

    public static int findKthLargest(int[] nums, int k) {
        return quickSelect(nums,0,nums.length-1,nums.length-k);
    }

    private static int quickSelect(int[] nums, int left, int right, int k) {

        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right-left+1);
        pivotIndex = partition(nums,left,right,pivotIndex);

        if(pivotIndex==k) {
            return nums[pivotIndex];
        } else if(pivotIndex<k) {
            return quickSelect(nums,pivotIndex+1,right,k);
        } else {
            return quickSelect(nums,left,pivotIndex-1,k);
        }
    }

    private static int partition(int[] nums,int left,int right,int pivotIndex) {
        int pivot = nums[pivotIndex];
        swap(nums,pivotIndex,right);
        int storeIndex=left;
        for(int i=left;i<right;i++) {
            if(nums[i]<pivot) {
                swap(nums,storeIndex,i);
                storeIndex++;
            }
        }
        swap(nums,storeIndex,right);
        return storeIndex;
    }

    private static void swap(int[] nums,int i,int j) {

        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
