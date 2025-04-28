package com.jayaprakash.instabyte100;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {

    public static void main(String[] args) {

        int[] nums={1,2,3};

        System.out.println(permutate(nums));

    }

    public static List<List<Integer>> permutate(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(new ArrayList<>(),nums,result);
        return result;
    }

    public static void backtrack(List<Integer> tempList,int[] nums,List<List<Integer>> result) {
        if(tempList.size()==nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {

            for (int i = 0; i < nums.length; i++) {
                if(tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backtrack(tempList,nums,result);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
