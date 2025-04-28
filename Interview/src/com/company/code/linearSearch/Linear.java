package com.jayaprakash.linearSearch;

import java.util.stream.IntStream;

public class Linear {

    public static void main(String[] args) {

        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 199;
        int ans = linearSearch(nums,target);

        if(ans > 0) {
            System.out.println("Target found at index "+ans);
        } else {

            System.out.println("Target not found");
        }


    }

    static int linearSearch(int[] arr, int target) {

        if(arr.length == 0) {
            return -1;
        }

        return IntStream.range(0, arr.length).filter(i -> target == arr[i]).findFirst().orElse(Integer.MAX_VALUE);


    }
}
