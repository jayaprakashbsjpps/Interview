package com.jayaprakash.dailyLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prefix3042 {

    public static void main(String[] args) {

        String[] words= {"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(words));
    }

    private static boolean isPrefixAndSuffix(String str1, String str2) {
        int n1 = str1.length(), n2 = str2.length();
        if (n1 > n2) {
            return false;
        }
        String sub1= str2.substring(0, n1);
        String sub2=str2.substring(n2-n1);

        //return str2.substring(0, n1).equals(str1) && str2.substring(n2 - n1).equals(str1);
        return  sub1.equals(str1) && sub2.equals(str1);
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int n = words.length, count = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
        }
    }
