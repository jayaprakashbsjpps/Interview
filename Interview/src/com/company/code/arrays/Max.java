package com.jayaprakash.arrays;

public class Max {

    public static void main(String[] args) {

        int[] arr = {101,3,23,100,9,18,53};
        System.out.println(max(arr));
    }

    private static int max(int[] arr) {

        int max = arr[0];

        for (int i = 1;i < arr.length; i++) {
               if(arr[i]> max) {
                   max = Math.max(max,arr[i]);
               }
        }

        return max;
    }
}
