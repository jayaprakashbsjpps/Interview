package com.jayaprakash.binary;

public class CeilingOfNumber {

    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int target = 9;

        System.out.println(getCeilingOfNumber(arr,target));

    }

    public static int getCeilingOfNumber(int[] arr, int target) {

        int start = 0;
        int end = arr.length -1;
        int mid = 0;

        while(start<=end) {

            mid = (int) Math.floor(start +(end-start)/2);

            if(target == arr[mid]) {

                return arr[mid];
            } else if(target > arr[mid]){

                    start = mid + 1;


            } else {

                end = mid - 1;
            }

        }

        return arr[start];

    }
}
