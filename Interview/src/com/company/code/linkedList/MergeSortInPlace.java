package com.jayaprakash.linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortInPlace {

    public static void main(String[] args) {

        int[] nums={5,4,3,2,1};
        mergeSortInPlace(nums,0, nums.length);

        System.out.println(Arrays.toString(nums));

    }

    static void mergeSortInPlace(int[] nums,int s,int e) {


        int mid= (s+e)/2;

        if((e-s)==1) {
            return;
        }

        mergeSortInPlace(nums,s,mid);
        mergeSortInPlace(nums,mid,nums.length);

        mergeInPlace(nums,s,mid,e);

    }

    private static void mergeInPlace(int[] arr, int s,int mid,int e) {

        int[] mix = new int[e-s];

        int i=s,j=mid;
        int k=0;
        while(i<mid && j< e) {

            if(arr[i]<=arr[j]) {

                mix[k] = arr[i];
                i++;
            } else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

//        if(i<arr.length) {
//
//            System.arraycopy(a,i,arr,k,left.length-i);
//        }
//
//        if(j<right.length) {
//
//            System.arraycopy(right,j,arr,k,right.length-j);
//        }

        while(i<mid) {

            mix[k]=arr[i];
            i++;
            k++;

        }

        while(j< e) {

            mix[k]=arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {

            arr[s+l]= mix[l];
            
        }

    }
}
