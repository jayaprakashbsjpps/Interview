package com.jayaprakash.dailyLeetCode;

import java.util.ArrayList;
import java.util.List;

public class Subsequence2825 {

    public static void main(String[] args) {

        String str1= "ab";
        String str2="d";
        System.out.println(canMakeSubsequence(str1,str2));
    }
    public static boolean canMakeSubsequence(String s1, String s2) {
        int j = 0, n = s1.length(), m = s2.length();
        for (int i = 0; i < n && j < m; ++i) {
            int a = s1.charAt(i), b = s2.charAt(j);
            if (a == b || a + 1 == b || a - 25 == b)
                ++j;
        }
        return j == m;
    }



}
