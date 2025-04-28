package com.jayaprakash.binary;

public class RotationArrayCount {

    public static void main(String[] args) {

        int[] nums = {15, 18, 2, 3, 6, 12};
        int pivot = findPivot(nums);

        System.out.println((findPivot(nums))+1);


    }

    public static int findPivot(int[] nums) {

        int start = 0;
        int end = nums.length -1;

        while(start<=end) {

            int mid =(int) Math.floor(start+(end-start)/2);

            if((mid+1) <= nums.length -1 && nums[mid] > nums[mid+1]) {

                return mid;
            }
            else if(nums[start] > nums[mid]) {
                end = mid;
            }
            else if(nums[mid] >= nums[end]) {
                start = mid +1;
            }
            else {

                return end;
            }
        }

        return -1;
    }
}
