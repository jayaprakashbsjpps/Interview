package com.jayaprakash.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappered448 {

    public static void main(String[] args) {

        int[] nums={4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(nums).toString());
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();
        int i=0;
        int n= nums.length;

        while(i<n) {
            int correctIndex = nums[i] -1;

            if((i+1) <n && nums[i]==nums[i+1]) {
                i++;
            }
            if(nums[i]==nums[correctIndex]) {

            }
            if(nums[i] < n && nums[i]!=nums[correctIndex]) {

                swap(nums,i,correctIndex);

            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
        for(int j=0;j<=nums.length-1;j++) {

            if((j+1)!=nums[j]) {
                list.add(j);
            }
        }

        //list.add(n);
        return list;


    }


    public static void swap(int[] nums,int i,int j) {

        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]= temp;
    }
}
