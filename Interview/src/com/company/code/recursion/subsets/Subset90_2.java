package com.jayaprakash.recursion.subsets;

import java.util.*;

public class Subset90_2 {

    public static void main(String[] args) {

        int[] nums={4,4,4,1,4};
        //expected
        //[[],[1],[1,4],[1,4,4],[1,4,4,4],[1,4,4,4,4],[4],[4,4],[4,4,4],[4,4,4,4]]
        //[[], [4], [4, 4], [4, 4, 4], [4, 4, 4, 1], [4, 4, 4, 1, 4], [4, 4, 4, 4], [4, 4, 1], [4, 4, 1, 4], [4, 4, 4], [4, 4], [4, 4, 1], [4, 4, 1, 4], [4, 4, 4], [4, 1], [4, 1, 4], [4, 4], [4], [4, 4], [4, 4, 1], [4, 4, 1, 4], [4, 4, 4], [4, 1], [4, 1, 4], [4, 4], [4], [4, 1], [4, 1, 4], [4, 4], [1], [1, 4], [4]]

        System.out.println(subsetsWithDup(nums));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        // Sort the array to handle duplicates
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // Start backtracking
        backtrack(result, new ArrayList<>(), nums, 0);

        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        result.add(new ArrayList<>(tempList));  // Add current subset to result

        for (int i = start; i < nums.length; i++) {
            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            tempList.add(nums[i]);  // Include nums[i] in the current subset
            backtrack(result, tempList, nums, i + 1);  // Recurse for the next elements
            tempList.remove(tempList.size() - 1);  // Backtrack (remove the last element)
        }
    }
}
