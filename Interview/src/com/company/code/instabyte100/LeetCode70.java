package com.jayaprakash.instabyte100;

import java.util.HashMap;

public class LeetCode70 {

    static HashMap<Integer,Integer> map = new HashMap<>();
    public static void main(String[] args) {

        System.out.println(climbStairs(4));

    }

    public static int climbStairs(int n) {

        map.put(1,1);
        map.put(2,2);
        return climb(n);
    }

    static int climb(int n) {

        if(n==1) return 1;
        if(n==2) return 2;

        if(map.containsKey(n)) {
            return map.get(n);
        }else {
            map.put(n,climb(n-1) + climb(n-2));
        }
        return map.get(n);

    }
}
