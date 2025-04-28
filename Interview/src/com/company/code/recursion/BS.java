package com.jayaprakash.recursion;

public class BS {

    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5};
        int start=0;
        int end= arr.length-1;
        int target=5;

        System.out.println(binarySearch(arr,target,start,end));
    }

    static int binarySearch(int[] arr,int target,int start,int end) {

        int mid = (int)Math.floor(start+ (end-start)/2);

        if(start>end) {
            return -1;
        }
        if(arr[mid]==target) {
            return mid;
        } else if(arr[mid]> target) {

            return binarySearch(arr,target,start,mid-1);
        } else {
           return binarySearch(arr,target,mid+1,end);
        }

    }
}
