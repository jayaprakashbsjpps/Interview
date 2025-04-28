package com.jayaprakash.dailyLeetCode;

import java.util.ArrayList;
import java.util.List;

public class Space2109 {

    public static void main(String[] args) {

        String s="LeetcodeHelpsMeLearn";
        int[] spaces = {8,13,15};
        System.out.println(addSpaces(s,spaces));
    }

    public static String addSpaces(String s, int[] spaces) {

        StringBuilder builder = new StringBuilder();

        builder.append(s.substring(0,spaces[0]));
        builder.append(' ');
        int i=0;

        for(i=1;i<spaces.length;i++) {

            builder.append(s.substring(spaces[i-1],spaces[i]));
            builder.append(' ');
        }

        builder.append(s.substring(spaces[i-1],s.length()));

        return builder.toString();

    }
}
