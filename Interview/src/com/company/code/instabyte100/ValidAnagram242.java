package com.jayaprakash.instabyte100;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ValidAnagram242 {

    public static void main(String[] args) {

        String s="rat";
        String t="car";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> map = new HashMap<>();

        if(s.length()!=t.length()) {
            return false;
        }

        for(int i=0;i<s.length();i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<t.length();i++) {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
        }

        for (Integer value: map.values()) {

            if(value!=0) {
                return false;
            }
        }
        return true;
    }
}
