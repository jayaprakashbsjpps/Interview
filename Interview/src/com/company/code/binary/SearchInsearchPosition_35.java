package com.jayaprakash.binary;

public class SearchInsearchPosition_35 {

    public static void main(String[] args) {

        //int[] nums = {1,3,5,6};
        int[] nums = {1,3,5,6};
        int target = 0;

        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length -1;
        int mid = 0;

        while(start<=end) {

            mid = (int) Math.floor(start +(end-start)/2);

            if(target == nums[mid]) {

                return mid;
            } else if(target > nums[mid]){

                if((mid+1) > end) {
                    return (mid+1);
                }

                if(target < nums[mid + 1]) {
                    return (mid+1);
                } else {
                    start = mid + 1;
                }


            } else  if(target < nums[mid]){

                if((mid-1) < 0) {
                    return mid;
                }
                end = mid - 1;
            }

        }

        return -1;
    }
}
