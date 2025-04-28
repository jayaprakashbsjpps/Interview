package com.jayaprakash.binary;

public class BinarySearch {

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length;
        int mid = 0;

        while(start <= end) {
            mid = (int) Math.floor(start+(end - start)/2);
            if(nums[mid] == target) {

                return mid;
            }

            if(target > nums[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target));
    }
}
