package com.jayaprakash.dailyLeetCode;

public class Shift2381 {

    public static void main(String[] args) {

        String s="abc";
        int[][] shifts={{0,1,0},{1,2,1},{0,2,1}};
        String ans= shiftingLetters(s,shifts);
        System.out.println(ans);

    }

    public static String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shiftDiff = new int[n + 1]; // Difference array to record shifts

        // Apply the shifts to the difference array
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];
            int delta = direction == 1 ? 1 : -1;

            shiftDiff[start] += delta;
            if (end + 1 < n) {
                shiftDiff[end + 1] -= delta;
            }
        }

        // Compute the cumulative shifts and build the result string
        StringBuilder result = new StringBuilder();
        int cumulativeShift = 0;
        for (int i = 0; i < n; i++) {
            cumulativeShift += shiftDiff[i];
            // Calculate the effective shift for the current character
            int netShift = (s.charAt(i) - 'a' + cumulativeShift) % 26;
            if (netShift < 0) netShift += 26; // Handle negative shifts
            result.append((char) ('a' + netShift));
        }

        return result.toString();

    }
}
