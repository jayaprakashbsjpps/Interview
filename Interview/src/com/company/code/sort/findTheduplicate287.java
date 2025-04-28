package com.jayaprakash.sort;

public class findTheduplicate287 {

    public static void main(String[] args) {

        int[] nums = {1,3,4,2,2};

        System.out.println(findDuplicate(nums));

    }
    public static int findDuplicate(int[] nums) {

        int i=0;
        int n= nums.length-1;
        while(i<=n) {

            int correctIndex = nums[i] -1;
            if(nums[i]!=nums[correctIndex]) {
                swap(nums,i,correctIndex);
            }  else {
                i++;
            }
        }


        for(i=0;i<=nums.length-1;i++) {

            if(nums[i]!=(i+1)) {
                return nums[i];
            }
        }

        return nums.length;
    }

    public static void swap(int[] nums,int i,int j) {

        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
