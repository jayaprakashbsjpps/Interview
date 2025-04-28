package com.jayaprakash.linearSearch;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SearchIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int target = 99;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (target == arr[i][j]) {
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{-1};
    }
}
