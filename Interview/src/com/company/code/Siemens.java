package com.jayaprakash;

import java.util.*;

public class Siemens {

//    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//
//    Input: nums = [2,2,1]
//    Output: 1
//
//    Input: nums = [4,1,2,1,2]
//    Output: 4
//
//    Input: nums = [1]
//    Output: 1

    public static void main(String[] args) {

        int[] nums= new int[]{4,1,2,1,2};

        //System.out.println(getUnique1(nums));
        System.out.println(getUnique2(nums));

       // int result = hashMap.entrySet().stream().filter(s->s.getValue().equals(1)).findFirst().get().getKey();

       // System.out.println("Answer "+result);

    }

    static int getUnique2(int[] nums) {

        int result =0;

        for (int i = 0; i <nums.length ; i++) {

            result = result ^ nums[i];

        }
        return result;
    }

    static int  getUnique1(int[] nums) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (hashMap.containsKey(nums[i])) {

                hashMap.put(nums[i], hashMap.get(nums[i])+1);
            } else {

                hashMap.put(nums[i],1);
            }

        }

        

//        Set<Map.Entry<Integer,Integer>> map = hashMap.entrySet();

//        for (Map.Entry<Integer,Integer> item:map) {
//
//            if(item.getValue()==1) {
//                System.out.println("Item found "+item.getKey());
//                return item.getKey();
//            }
//        }

        return -1;
    }
}
