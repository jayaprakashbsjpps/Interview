package com.jayaprakash.recursion.arrays;

public class Sorted {

    public static void main(String[] args) {

        int[] arr= {1,2,3,7,5,6};

        System.out.println(isSorted(arr,0));

    }

    static boolean isSorted(int[] arr, int index) {

        //System.out.println(arr.length);
        if(index== arr.length-1) {

            return true;
        }
        return (index+1) < arr.length && arr[index]<arr[index+1] && isSorted(arr,index+1);
    }
}
