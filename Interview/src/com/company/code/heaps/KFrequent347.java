package com.jayaprakash.heaps;

import java.util.*;

public class KFrequent347 {

    public static void main(String[] args) {
        int[] nums=new int[]{1,1,1,2,2,3};
        //int[] nums=new int[]{1,2};

        System.out.println(Arrays.toString(topKFrequent1(nums, 2)));
    }

    public static int[] topKFrequent1(int[] nums, int k) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i<nums.length;i++) {

            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minHeap= new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer,Integer> item:hashMap.entrySet()) {
            minHeap.offer(item);
            if(minHeap.size()>k) {
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        for (int i = k-1; i >= 0; i--) {
            result[i]=minHeap.poll().getKey();
        }

        return result;

    }


    public static int[] topKFrequent(int[] nums, int k) {

        int[] result = new int[k];
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int i=0;i<nums.length;i++) {

            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (int i=0;i<k;i++) {
            result[i]=entryList.get(i).getKey();
        }
        return result;

    }
}
