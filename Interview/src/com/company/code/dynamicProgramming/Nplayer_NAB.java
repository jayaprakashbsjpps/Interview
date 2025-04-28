package com.jayaprakash.dynamicProgramming;

import java.util.HashSet;
import java.util.Set;

public class Nplayer_NAB {

    public static void main(String[] args) {

       // String S="><^v";
        String S="><><";
        //System.out.println(solution(S));
        System.out.println(solution2(S));
    }

    public static int solution2(String moves) {

        int count = 0;
        Set<Integer> occupied = new HashSet<>();

        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            if (move == '^') {
                if (!occupied.contains(i - 1)) {
                    count++;
                    occupied.add(i - 1);
                }
            } else if (move == 'v') {
                if (!occupied.contains(i + 1)) {
                    count++;
                    occupied.add(i + 1);
                }
            } else if (move == '<') {
                if (!occupied.contains(i)) {
                    count++;
                    occupied.add(i);
                }
            } else if (move == '>') {
                if (!occupied.contains(i + 1)) {
                    count++;
                    occupied.add(i + 1);
                }
            }
        }
        return count;

    }

    public static int solution(String S) {
        int N = S.length();
        Set<Integer> occupied = new HashSet<>();

        int successfulMoves = 0;

        // Traverse from left to right
        for (int i = 0; i < N; i++) {
            char move = S.charAt(i);

            if (move == '<') {
                // Try to move left
                if (i - 1 >= 0 && !occupied.contains(i - 1)) {
                    // Move is successful
                    occupied.add(i - 1);
                    successfulMoves++;
                }
            } else if (move == '>') {
                // Try to move right
                if (i + 1 < N && !occupied.contains(i + 1)) {
                    // Move is successful
                    occupied.add(i + 1);
                    successfulMoves++;
                }
            }
        }

        return successfulMoves;
    }
}

