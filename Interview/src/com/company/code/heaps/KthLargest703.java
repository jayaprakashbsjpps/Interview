package com.jayaprakash.heaps;

import java.util.*;

public class KthLargest703 {

    public static void main(String[] args) {

        int[] nums={4, 5, 8, 2};
        int k=3;

        KthLargest703 obj = new KthLargest703(k, nums);
        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
        System.out.println(obj.add(9));
        System.out.println(obj.add(4));
    }

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int K;
    public KthLargest703(int k, int[] nums) {

        this.K = k;

        for(int num : nums){

            minHeap.add(num);

            if(minHeap.size() > K){

                minHeap.poll();
            }
        }
    }

    public int add(int val) {

        minHeap.add(val);

        if(minHeap.size() > K){

            minHeap.poll();
        }

        return minHeap.peek();
    }
}
