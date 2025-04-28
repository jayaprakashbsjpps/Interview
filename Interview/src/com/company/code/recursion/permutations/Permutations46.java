package com.jayaprakash.recursion.permutations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutations46 {

    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,new ArrayList<>(),result);
        return result;

    }

    private static void backtrack(int[] nums,List<Integer> current,List<List<Integer>> result) {

        if(current.size()==nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int num:nums) {
            if(current.contains(num)) continue;
            current.add(num);
            backtrack(nums,current,result);
            current.remove(current.size()-1);
        }
    }
}
