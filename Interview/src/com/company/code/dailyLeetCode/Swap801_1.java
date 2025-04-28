package com.jayaprakash.dailyLeetCode;

import java.util.Arrays;

public class Swap801_1 {

    public static void main(String[] args) {

        int[] nums1={1,3,5,4};
        int[] nums2={1,2,3,7};

        System.out.println(minSwap(nums1,nums2));
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

    }

    public static int minSwap(int[] nums1, int[] nums2) {
        int[] noSwap = new int[nums1.length];
        int[] swap = new int[nums1.length];

        swap[0]=1;
        for(int i=1; i<nums1.length; i++){
            swap[i]=noSwap[i]=nums1.length;
            if(nums1[i-1]<nums1[i] && nums2[i-1]<nums2[i]){
                // perform swaps in i-1 and 1 to maintain order
                swap[i]=swap[i-1]+1;
                noSwap[i]=noSwap[i-1]; // don't swap at all
            }

            // swap at either i-1 or 1 but not both
            if(nums1[i-1]<nums2[i] && nums2[i-1]<nums1[i]){
                swap[i]=Math.min(noSwap[i-1]+1, swap[i]);
                noSwap[i]=Math.min(swap[i-1], noSwap[i]);
            }
        }

        return Math.min(noSwap[nums1.length-1], swap[nums1.length-1]);
    }
}
