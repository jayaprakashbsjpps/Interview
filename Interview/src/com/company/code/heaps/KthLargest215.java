package com.jayaprakash.heaps;

import java.util.PriorityQueue;

public class KthLargest215 {

    public static void main(String[] args) {

        int[] nums={3,2,1,5,6,4};

        System.out.println(findKthLargest(nums,2));

    }

    public static int  findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        for (int num:nums) {

            minHeap.offer(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();

    }
}
