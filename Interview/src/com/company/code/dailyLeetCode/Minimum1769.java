package com.jayaprakash.dailyLeetCode;

import java.util.Arrays;

public class Minimum1769 {

    public static void main(String[] args) {

        String boxes="110";
        System.out.println(Arrays.toString(minOperations(boxes)));

    }

    public static int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] distances = new int[n];

        int prefixCount = 0;
        int prefixSum = 0;

        for (int i = 0; i < n; ++i) {
            distances[i] = prefixCount * i - prefixSum;
            if (boxes.charAt(i) == '1') {
                ++prefixCount;
                prefixSum += i;
            }
        }

        int suffixCount = 0;
        int suffixSum = 0;

        for (int i = n - 1; i >= 0; --i) {
            distances[i] += suffixSum - suffixCount * i;
            if (boxes.charAt(i) == '1') {
                ++suffixCount;
                suffixSum += i;
            }
        }

        return distances;
    }
}
