package com.jayaprakash.binary;

public class RotatedSortArrayDup81 {

    public static void main(String[] args) {

       // int[] nums = {2,5,6,0,0,1,2};
        //int[] nums = {1,0,1,1,1};
       // int[] nums = {3,1,1,1,1};
        int[] nums = {2,2,2,3,1};
        //int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 1;


        System.out.println(search(nums,target));
    }


    public static boolean search(int[] nums, int target) {

        int pivot = findPivot(nums);

        if(pivot==-1) {

            if(binarySearch(nums,0,nums.length-1,target,true)>-1) {

                return true;
            }
            else {
                return false;
            }
        } else{
            if(target==nums[pivot]) {

                return true;

            }else if(pivot!=0 && nums[0] < target && target < nums[pivot])  {
                if(binarySearch(nums,0,pivot-1,target,true)>-1) {

                    return true;
                }
                else {
                    return false;
                }
            } else {

                if(binarySearch(nums,pivot + 1,nums.length -1 ,target,true)>-1) {

                    return true;
                }
                else {
                    return false;
                }
            }
        }

    }

    public static int findPivot(int[] nums) {

        int start = 0;
        int end =nums.length -1;

        while(start<=end) {

            int mid = (int) Math.floor(start +(end-start)/2);

            if((mid-1) > -1 && nums[mid] <nums[mid-1]) {

                return mid-1;
            }
            else if((mid+1) <= end && nums[mid] > nums[mid+1]) {

                return mid;

            } else if(nums[start]==nums[mid] && nums[mid]==nums[end]) {

                if((start-1)> -1 && nums[start-1] >nums[start]) {
                    return start -1;
                }
                start++;

                if((end-1) > -1 && nums[end-1] > nums[end]) {
                    return end-1;
                }
                end--;

            }
//            else if((mid+1) <= end && nums[mid] == nums[mid+1]) {
//
//                start = mid +1;
//            }
            else if(nums[start] >= nums[mid]){

                end = mid -1;
            }  else {

                start = mid +1;
            }
        }

        return -1;
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
