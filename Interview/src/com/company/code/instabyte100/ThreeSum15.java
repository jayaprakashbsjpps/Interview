package com.jayaprakash.instabyte100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {

    public static void main(String[] args) {

        int[] nums ={-1,0,1,2,-1,-4};

        threeSum(nums);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Call twoSum with target as -nums[i]
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum < target) {
                    left++; // Move the left pointer to increase the sum
                } else if (sum > target) {
                    right--; // Move the right pointer to decrease the sum
                } else {
                    // Found a triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicates for the second number
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicates for the third number
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }

        return result;

    }

}
