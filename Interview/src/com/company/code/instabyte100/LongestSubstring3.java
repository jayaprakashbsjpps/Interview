package com.jayaprakash.instabyte100;

import java.util.HashSet;

public class LongestSubstring3 {

    public static void main(String[] args) {

        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxLength=0;
        //sliding window pointers
        int left=0,right=0;

        HashSet<Character> set = new HashSet<>();

        while(right<n) {

            char currentChar = s.charAt(right);
            while(set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currentChar);
            maxLength=Math.max(maxLength,right-left+1);
            right++;
        }

        return maxLength;
    }

}
