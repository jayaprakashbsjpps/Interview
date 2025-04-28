package com.jayaprakash.dynamicProgramming;


import java.util.Arrays;

public class NholeNAB {

    public static void main(String[] args) {

        //int[] A={1,3,6,4,1,2};
        int[] A={15, 20, 9, 11};

        System.out.println(solution(A));
    }


    public static int solution(int[] A) {
        // Step 1: Sort the positions of the holes
        Arrays.sort(A);

        // Step 2: Define the binary search bounds
        int N = A.length;
        int low = 1; // Minimum possible length of a board
        int high = A[N-1] - A[0]; // Maximum possible length of a board (to cover all holes in one board)

        // Step 3: Binary search for the minimum board length
        while (low < high) {
            int mid = (low + high) / 2;

            // Step 4: Check if we can cover all holes with two boards of length `mid`
            if (canCoverWithBoards(A, mid)) {
                high = mid; // Try smaller length
            } else {
                low = mid + 1; // Try larger length
            }
        }

        return low;
    }


    // Helper function to check if two boards of length `L` can cover all holes
    private static boolean canCoverWithBoards(int[] A, int L) {
        int N = A.length;

        // Place the first board starting from A[0]
        int firstBoardEnd = A[0] + L;

        // Find the first hole that cannot be covered by the first board
        int i = 0;
        while (i < N && A[i] <= firstBoardEnd) {
            i++;
        }

        // If all holes are covered by the first board, return true
        if (i == N) {
            return true;
        }

        // Place the second board starting from the first uncovered hole
        int secondBoardEnd = A[i] + L;

        // Check if all remaining holes are covered by the second board
        while (i < N && A[i] <= secondBoardEnd) {
            i++;
        }

        // If all holes are covered, return true
        return i == N;
    }
}
