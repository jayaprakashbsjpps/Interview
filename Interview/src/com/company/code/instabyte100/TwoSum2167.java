package com.jayaprakash.instabyte100;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2167 {

    public static void main(String[] args) {

        int[] numbers={2,3,4};

        System.out.println(Arrays.toString(twoSum(numbers,20)));


    }

    public static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int diff = target - numbers[i];
            if(map.containsKey(diff)) {

                return new int[] {map.get(diff),i};
            }
            map.put(numbers[i],i);

        }
        return new int[0];
    }
}
