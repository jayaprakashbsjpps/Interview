package com.jayaprakash.instabyte100;

import com.jayaprakash.EPAMInterview1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cognizant5 {

    public static void main(String[] args) {

       //s1 = "abc", s2="ahbgdc", check of s1 is a subsequence of s2

        String s1="abc";
        String s2="ahbgdc";

        System.out.println(isSubSequence(s1,s2));
    }

    private static boolean isSubSequence(String s,String t) {

        int sp =0;
        int tp=0;

        while(sp<s.length() && tp<t.length()) {

            if(s.charAt(sp)==t.charAt(tp)) {
                sp++;
            }
            tp++;
        }

        return sp==s.length();

    }
}
