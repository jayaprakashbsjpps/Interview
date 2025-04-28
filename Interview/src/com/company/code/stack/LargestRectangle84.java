package com.jayaprakash.stack;

import java.util.Arrays;

public class LargestRectangle84 {

    public static void main(String[] args) {

        //int[] heights={2,1,5,6,2,3};
        int[] heights={2,4};
        System.out.println(largestRectangleArea(heights));
    }

    public static int largestRectangleArea(int[] heights) {

        return largestRectangleArea(0,heights,heights.length,0);

    }

    private static int largestRectangleArea(int maxSum,int[] heights,int size,int sum) {

        if(size==0) {
            return sum;
        }

        if(sum >= maxSum) {
            return largestRectangleArea(2* Math.min(heights[0],heights[1]),Arrays.copyOfRange(heights,1,heights.length),size-1,sum);
        }

        return largestRectangleArea(2* Math.min(heights[0],heights[1]),Arrays.copyOfRange(heights,1,heights.length), size-1,maxSum);

    }
}
