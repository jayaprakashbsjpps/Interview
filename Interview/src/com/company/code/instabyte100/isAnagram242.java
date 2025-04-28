package com.jayaprakash.instabyte100;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class isAnagram242 {

    public static void main(String[] args) {

        String s="aacc";
        String t="ccac";

        System.out.println(isAnagram(s,t));

    }
    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) {
            return false;
        }

        HashMap<Character,Integer> sourceMap= new HashMap<>();
        HashMap<Character,Integer> destMap= new HashMap<>();

        for(int i=0;i<s.length();i++) {

            sourceMap.put(s.charAt(i),sourceMap.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<t.length();i++) {

            destMap.put(t.charAt(i),destMap.getOrDefault(t.charAt(i),0)+1);
        }

        System.out.println(sourceMap);
        System.out.println(destMap);
        for(Map.Entry<Character,Integer> item:sourceMap.entrySet()) {

            Character itemKey = item.getKey();
            Integer itemValue = item.getValue();

            if(destMap.get(itemKey).intValue()!=itemValue.intValue()) {
                System.out.println(itemKey+" "+itemValue);
                System.out.println(destMap.get(itemKey));
                return false;
            }

            if(!destMap.containsKey(itemKey) && destMap.get(itemKey)!=itemValue) {
                return false;
            }


        }

        return true;

    }
}
