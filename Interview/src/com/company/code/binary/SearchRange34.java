package com.jayaprakash.binary;

import com.jayaprakash.access.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchRange34 {

    public static void main(String[] args) {

       int[] nums = {5,7,7,8,8,10};
        int target = 8;

        //int[] nums = {1,2,2};

        //int[] nums={1};
        //int[] nums = {1,3};

       // int[] nums = {2,2};

        //int[] nums = {1};
       // int[] nums = {5,7,7,8,8,10};
        //int[] nums = {1};
        //int target = 8;
        //int target =2;

        //int target = 1;

        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        int start =  search(nums,target,true);
        int end =  search(nums,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;

    }

    static int search(int[] nums, int target,boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while(start<=end) {

            int mid = start + (end - start)/2;

            if(target < nums[mid]) {
                end = mid -1;
            } else if(target > nums[mid]) {
                start = mid +1;
            }else {

                ans = mid;
                if(findStartIndex) {
                    end = mid -1;
                } else {
                    start= mid + 1;
                }
                //return mid;
            }
        }
        return ans;
    }

//    static int[] binarySearchRange(int[] nums,int start, int end, int target) {
//
//        int[] arr = new int[]{-1,-1};
//        while(start<=end) {
//
//            int mid = (int)(Math.floor((start + (end - start)/2)));
//
//            if (nums[mid]== target) {
//
//                if((mid+1) <= (nums.length -1) && nums[mid]==nums[mid+1]) {
//                    arr[0]=binarySearch(nums, 0, Math.abs(mid),target);
//                    arr[1]=binarySearch(nums,Math.abs(mid+1),nums.length - 1,target);
//                }
//                else if((mid-1) >= 0 && nums[mid-1]==nums[mid]) {
//                    arr[0]=binarySearch(nums, 0, Math.abs(mid-1),target);
//                    arr[1]=binarySearch(nums,Math.abs(mid),nums.length - 1,target);
//                } else if((mid+1) == nums.length){
//
//                    arr[0]=binarySearch(nums, 0, Math.abs(mid-1),target);
//                    arr[1]=binarySearch(nums,Math.abs(mid),nums.length - 1,target);
//                } else {
//
//                    arr[0]=binarySearch(nums, 0, Math.abs(mid-1),target);
//                    arr[1]=binarySearch(nums,Math.abs(mid + 1),nums.length - 1,target);
//                }
//
//
//                return arr;
//
//            }else if (target < nums[mid]) {
//
//                end = mid -1;
//            }
//            else {
//
//                start = mid + 1;
//            }
//
//        }
//        return new int[]{-1,-1};
//    }

//    static int binarySearch(int[] nums,int start, int end, int target) {
//
//        while(start<=end) {
//
//            int mid = (int)(Math.floor((start + (end - start)/2)));
//
//            if (nums[mid]== target) {
//
//                return mid;
//            } else if (target < nums[mid]) {
//
//                end = mid -1;
//            }
//            else {
//
//                start = mid + 1;
//            }
//
//        }
//
//        return -1;
//
//    }
}
