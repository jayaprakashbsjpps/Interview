package com.jayaprakash.instabyte100_2;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoSum_1 {

    public static void main(String[] args) {

        //int[] nums={3,2,3};
       // int[] nums={2,7,11,15};
        //int target=6;
       // int target=17;
        int[] nums={2,5,5,11};
        int target=10;

        //System.out.println(Arrays.toString(twoSum(nums,target)));

       // System.out.println(Arrays.toString(twoSumStream(nums,target)));

        System.out.println(Arrays.toString(twoSumBrute(nums,target)));


    }

    private static int[] twoSumBrute(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = 1; j < nums.length; j++) {

                if(nums[i]+nums[j]==target) {
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{-1,-1};
    }

    private static int[] twoSumStream(int[] nums, int target) {

       return IntStream.range(0, nums.length)
                     .boxed()
                     .flatMap(i-> IntStream.range(i+1, nums.length)
                             .filter(j->nums[i]+nums[j]==target)
                             .mapToObj(j-> new int[]{i,j}))
                             .findFirst()
                             .orElseThrow(()->new IllegalArgumentException("not Argument"));



    }


    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int diff=target-nums[i];
            if(map.containsKey(diff)) {

                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
}
