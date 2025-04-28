package com.jayaprakash.instabyte100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {

    public static void main(String[] args) {

        int[] nums={1,2,3};

        System.out.println(permute(nums));

    }
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> unprocess = Arrays.stream(nums).boxed().collect(Collectors.toList());
        genPerm(unprocess, new ArrayList<>(),result);
        return result;

    }

    public static void genPerm(List<Integer> unprocess,List<Integer> process, List<List<Integer>> result) {

        if(unprocess.isEmpty()) {
            result.add(new ArrayList<>(process));
            return;
        }

        for (int i = 0; i < unprocess.size(); i++) {

            process.add(unprocess.getFirst());
            int removed = unprocess.removeFirst();
            genPerm(unprocess,process,result);
            process.removeLast();
            unprocess.add(removed);
        }

    }
}
