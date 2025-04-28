package com.jayaprakash.instabyte100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class HouseRob198 {

    static HashMap<Integer,Integer> map = new HashMap<>();
    public static void main(String[] args) {

        //int[] nums={2,1,1,2};
        int[] nums={2,7,9,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int n=nums.length;

        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }

        //Map<Integer,Integer> memo = new HashMap<>();
//        memo.put(0,nums[0]);
//        memo.put(1,Math.max(nums[0],nums[1]));
       // return helper(n-1,nums,memo);

        return dp[n-1];
    }

    static int helper(int i, int[] nums, Map<Integer,Integer> memo) {

        if(memo.containsKey(i)) return memo.get(i);
        int result = Math.max(helper(i-1,nums,memo),nums[i]+helper(i-2,nums,memo));
        memo.put(i,result);
        return result;

    }


}
