package com.jayaprakash.instabyte100;

import java.util.*;
import java.util.stream.Collectors;

public class GrpAnagram49 {

    public static void main(String[] args) {

        String[] strs={"eat","tea","tan","ate","nat","bat"};
        //System.out.println(groupAnagrams(strs));
        System.out.println(groupAnagrams1(strs));
    }

    public static List<List<String>> groupAnagrams1(String[] strs) {

      return new ArrayList<>(Arrays.stream(strs).collect(Collectors.groupingBy(

                str-> {
                    char[] chars = str.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }
        )).values());
    }

    /*public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++) {

            char[] charSet = strs[i].toCharArray();
            Arrays.sort(charSet);
            String key = new String(charSet);
            if(!map.containsKey(key)) {
                map.put(key,new ArrayList<String>());
            }
            List<String> list = map.get(key);
            list.add(strs[i]);
            map.put(key,list);

        }

        return new ArrayList<>(map.values());
    }*/


}
