package com.jayaprakash.dailyLeetCode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NonOverLapping2054 {

    public static void main(String[] args) {

        //int[][] events={{1,3,2},{4,5,2},{2,4,3}};
        int[][] events={{1,5,3},{1,5,1},{6,6,5}};
        //int[][] events={{1,3,2},{4,5,2},{1,5,5}};

        System.out.println(maxTwoEvents(events));
    }

    public  static int maxTwoEvents(int[][] events) {
        int result = 0;
        Arrays.sort(events,(a,b)->Integer.compare(a[1],b[1]));
        for (int i = 0; i < events.length; i++) {
            result=Math.max(result,events[i][2]);
            int[] arr1 = events[i];
            for (int j = 0; j < events.length; j++) {
                int[] arr2 = events[j];
                if(i==j || (arr1[0]>arr2[0])) {
                    continue;
                }

                if(isOverlapping(arr1,arr2)) {
                    continue;
                }
                result=Math.max(result,events[i][2]+events[j][2]);

            }
        }
        return result;
    }

    private static boolean isOverlapping(int[] arr1, int[] arr2) {


        if(arr1[1]>=arr2[0]) {
            return true;
        } else {
            return false;
        }
    }


}
