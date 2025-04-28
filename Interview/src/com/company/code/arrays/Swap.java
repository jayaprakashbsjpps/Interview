package com.jayaprakash.arrays;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        int[] arr = {1,3,23,9,18};

        reverse(arr);
        System.out.println(Arrays.toString(arr));



    }

    private static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while(start < end) {

            swap(arr,start,end);
            start++;
            end--;
        }


    }

    private static void swap(int[] arr, int i, int i1) {

        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1]= temp;
    }
}
