package com.jayaprakash.dailyLeetCode;

import java.util.Arrays;

public class Swaps801 {

    static int count;
    public static void main(String[] args) {

        int[] nums1={1,3,5,4};
        int[] nums2={1,2,3,7};

        System.out.println(minSwap(nums1,nums2));
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

    }

    public static int minSwap(int[] nums1, int[] nums2) {
        int n = nums1.length;
        // Create a memoization table
        int[][] memo = new int[n][2];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return helper(nums1, nums2, 0, 0, memo);
    }

    private static int helper(int[] nums1, int[] nums2, int index, int swapped, int[][] memo) {
        // Base case: if we reach the end of the arrays
        if (index == nums1.length) {
            return 0;
        }

        // Check memo table
        if (memo[index][swapped] != -1) {
            return memo[index][swapped];
        }

        // Initialize minimum swaps for this state
        int minSwaps = Integer.MAX_VALUE;

        // Get previous values based on whether we swapped or not
        int prev1, prev2;
        if (index == 0) {
            prev1 = Integer.MIN_VALUE;
            prev2 = Integer.MIN_VALUE;
        } else {
            if (swapped == 1) {
                prev1 = nums2[index - 1];
                prev2 = nums1[index - 1];
            } else {
                prev1 = nums1[index - 1];
                prev2 = nums2[index - 1];
            }
        }

        // Option 1: Do not swap at the current index
        if (nums1[index] > prev1 && nums2[index] > prev2) {
            minSwaps = helper(nums1, nums2, index + 1, 0, memo);
        }

        // Option 2: Swap at the current index
        if (nums1[index] > prev2 && nums2[index] > prev1) {
            minSwaps = Math.min(minSwaps, 1 + helper(nums1, nums2, index + 1, 1, memo));
        }

        // Save the result in the memo table
        memo[index][swapped] = minSwaps;
        return minSwaps;
    }
}
