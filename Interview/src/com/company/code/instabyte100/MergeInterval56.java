package com.jayaprakash.instabyte100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval56 {

    public static void main(String[] args) {

        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};
        Arrays.stream(merge(intervals)).forEach(s-> System.out.println(Arrays.toString(s)));

    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if(interval[0]<=prev[1]) {
                prev[1]=Math.max(prev[1],interval[1]);
            }else {
                merged.add(prev);
                prev=interval;
            }
        }

        merged.add(prev);
        return merged.toArray(new int[merged.size()][]);

    }
}
