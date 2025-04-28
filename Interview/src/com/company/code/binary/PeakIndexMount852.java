package com.jayaprakash.binary;

public class PeakIndexMount852 {

    public static void main(String[] args) {

        //int[] arr = {1,2,3,5,7,6,3,2};
        int[] arr={0,3,5,12,2};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {

            int mid=(int)Math.floor(start+(end-start)/2);

            if(arr[mid]<arr[mid+1]) {
                start=mid+1;
            } else {
                end = mid -1;
            }
        }

        return start;
    }
}
