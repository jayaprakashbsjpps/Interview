package com.jayaprakash.recursion.subsets;

import java.util.List;

import java.util.ArrayList;

public class Subset78_2 {

    public static void main(String[] args) {

        int[] nums={1,2,3};
        List<List<Integer>> subsets = subsets(nums);
        System.out.println(subsets);

    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> currentSubset, int[] nums, int start) {
        // Add the current subset to the result
        result.add(new ArrayList<>(currentSubset));
        System.out.println(result);
        // Explore further possibilities
        for (int i = start; i < nums.length; i++) {
            // Add the current element to the subset
            currentSubset.add(nums[i]);
            System.out.println(currentSubset);
            // Recur with the updated subset
           backtrack(result, currentSubset, nums, i + 1);
            // Backtrack by removing the last element to explore other possibilities
            currentSubset.remove(currentSubset.size() - 1);
            System.out.println(currentSubset);
        }
    }
}


