package com.jayaprakash.binary;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedSortedArray33 {

    public static void main(String[] args) {

        //int[] nums = {4,5,6,7,0,1,2};
        //int[] nums = {4,5,6,7,0,1,2};
       // int[] nums ={1};
        int[] nums ={1,3};
        int pivot = findPivot(nums);
        int target = 0;
        int index1 = binarySearch(nums,0,pivot,target,true);

        if(index1==-1) {

            System.out.println(binarySearch(nums,pivot +1,nums.length -1,target,true));
        }
        else {

            System.out.println(index1);
        }
    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        int mid=0;

        while(start<=end) {

            mid=(int) Math.floor(start+(end-start)/2);

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

        return mid;

    }
    public static int binarySearch(int[] nums, int start, int end,int target,boolean asc) {

        while(start<=end) {

            if(asc) {

                int mid = (int) Math.floor(start + (end-start)/2);

                if(target > nums[mid]) {

                    start = mid + 1;
                }
                else if(target < nums[mid]){

                    end = mid -1;
                }
                else {
                    return mid;
                }

            } else {

                int mid = (int) Math.floor(start + (end-start)/2);

                if(target > nums[mid]) {

                    end = mid - 1;
                }
                else if(target < nums[mid]){

                    start = start + 1;
                }
                else {
                    return mid;
                }

            }

        }

        return -1;
    }
}
