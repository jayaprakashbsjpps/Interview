package com.jayaprakash;

import java.util.Arrays;

public class Epsilon {

    public static void main(String[] args) {


//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = i+1; j < arr.length; j++) {
//
//                if(arr[i] > arr[j] ) {
//
//                    swap(arr,i,j);
//                }
//
//            }
//
//        }
        int[] arr = {1,2,2,0,0,1,2,2,1};

        int start = 1;
        int end = arr.length - 1;
        int max = arr[0];
        while(start < end) {

            if(arr[start] < max) {

                swap(arr,start,end);
                max= arr[start];
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[], int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
