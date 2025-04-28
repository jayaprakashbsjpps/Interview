package com.jayaprakash.instabyte100;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Duplicate217 {

    public static void main(String[] args) {

        int[] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(x->x,Collectors.counting())).values().stream().anyMatch(x->x>1);

    }
}
