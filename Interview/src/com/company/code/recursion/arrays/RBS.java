package com.jayaprakash.recursion.arrays;

public class RBS {

    public static void main(String[] args) {

        //int[] arr={4,5,6,7,0,1,2};
        //int[] arr={0,1,2,3,4,5,6}
        //int target=0;
        //int[] arr={1,3};
        //int target=3;
        //int[] arr={5,1,3};
        //int target=5;
        //int[] arr={3,5,1};
        int[] arr={4,5,6,7,8,1,2,3};
        //int target=3;
        int target=8;

        System.out.println(rotatedBS(arr,target,0, arr.length-1));
    }

    static int rotatedBS(int[] nums, int target,int start,int end) {

        int mid= (int)Math.floor(start+(end-start)/2);

        if(start>end) {

            return -1;
        }

        if(nums[mid]==target) {

            return mid;
        }
        if(nums[start]<=nums[mid]){

            if(target>=nums[start] && target<=nums[mid]) {

                return rotatedBS(nums,target,start,mid-1);
            }
            else {

                return rotatedBS(nums,target,mid+1,end);
            }


        } else {


            if(target>=nums[mid] && target<=nums[end]) {

                return rotatedBS(nums,target,mid+1,end);
            }
            else {

                return rotatedBS(nums,target,start,mid-1);

            }


        }


    }
}
