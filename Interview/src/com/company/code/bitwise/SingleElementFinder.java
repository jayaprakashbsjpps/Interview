package com.jayaprakash.bitwise;

public class SingleElementFinder {

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 4, 4, 4};
        System.out.println("The element that appears once is: " + findSingleElement(arr));
    }
    public static int findSingleElement(int[] arr) {
        int ones = 0, twos = 0;
        for (int num : arr) {
            int tempInt = (ones ^ num);
            ones = tempInt & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }


}