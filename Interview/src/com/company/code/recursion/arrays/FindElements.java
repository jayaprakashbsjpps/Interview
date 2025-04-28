package com.jayaprakash.recursion.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindElements {

    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        int[] arr={1,2,3,7,4,4,5};
        int target=4;

        //System.out.println(find(arr,target,0));

        //System.out.println(findIndex(arr,target,0));
       //findAllIndex(arr,target,0);

        //System.out.println(list.toString());
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(findAllIndex2(arr,target,0,list));

        System.out.println(findAllIndex3(arr,target,0));

    }

    static boolean find(int[] arr, int target, int index) {

        if(index==arr.length) {
            return false;
        }

        return arr[index]==target || find(arr,target,index+1);

    }

    static int findIndex(int[] arr, int target, int index) {

        if(index==arr.length) {
            return -1;
        }

        if(arr[index]==target) {
            return index;
        }

        return findIndex(arr,target,index+1);

    }

    static void findAllIndex(int[] arr, int target, int index) {

        if(index==arr.length) {
            return;
        }

        if(arr[index]==target) {
            list.add(index);
        }

        findAllIndex(arr,target,index+1);

    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list) {

        if(index==arr.length) {
            return list;
        }

        if(arr[index]==target) {
            list.add(index);
        }

        return findAllIndex2(arr,target,index+1,list);

    }

    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index) {

        ArrayList<Integer> list= new ArrayList<>();

        if(index==arr.length) {
            return list;
        }

        if(arr[index]==target) {

            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls= findAllIndex3(arr,target,index+1);

        list.addAll(ansFromBelowCalls);
        return  list;

    }
}
