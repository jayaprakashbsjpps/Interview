package com.jayaprakash.dynamicProgramming;


import java.util.Arrays;
public class NholeNAB_2 {


    public static void main(String[] args) {

        //int[] A={1,3,6,4,1,2};
        //int[] A={1,2,3};
        int[] A={15, 20, 9, 11};

        System.out.println(solution(A));
    }


    public static int solution(int[] A) {
//One hole will need only 1
        if(A.length == 1)
            return 1;
        Arrays.sort(A);
        int lo = 1;
        int hi = A[A.length - 1] - A[0];
        int result = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossible(A, mid)) {
                result = mid;
                hi = mid - 1;
                //board lengths
            } else {
                lo = mid + 1;
            }
        }

        return result;
    }

    private static boolean isPossible(int[] A, int boardLength) {
        int lastPosition = A[0];
        int boardsNeeded = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] - lastPosition > boardLength) {
                lastPosition = A[i];
                boardsNeeded++;
            }
        }

// Check if at most 2 boards are needed
        return boardsNeeded <= 2 && A[A.length - 1] - lastPosition <= boardLength;
    }
}
