package com.jayaprakash.instabyte100;

import java.util.*;

public class Robots2398 {

    public static void main(String[] args) {

       int[] chargeTimes={3,6,1,3,4};
       int[] runningCosts={2,1,3,4,5};
//        int[] chargeTimes={11,12,19};
//        int[] runningCosts={10,8,7};
//        int[] chargeTimes={8,76,74,9,75,71,71,42,15,58,88,38,56,59,10,11};
//        int[] runningCosts={1,92,41,63,22,37,37,8,68,97,39,59,45,50,29,37};
        int budget=25;
        //int budget=19;
       // int budget=412;

        System.out.println(maximumRobots(chargeTimes,runningCosts,budget));
    }

    public static int maximumRobots(int[] times, int[] costs, long budget) {

        long sum = 0;
        int i = 0, n = times.length;
        Deque<Integer> d = new LinkedList<Integer>();
        for (int j = 0; j < n; ++j) {
            sum += costs[j];
            while (!d.isEmpty() && times[d.peekLast()] <= times[j])
                d.pollLast();
            d.addLast(j);
            if (times[d.getFirst()] + (j - i + 1) * sum > budget) {
                if (d.getFirst() == i)
                    d.pollFirst();
                sum -= costs[i++];
            }
        }
        return n - i;
    }
}
