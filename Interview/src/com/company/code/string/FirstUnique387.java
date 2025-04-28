package com.jayaprakash.string;

import java.util.Arrays;
import java.util.HashMap;

public class FirstUnique387 {

    public static void main(String[] args) {

        System.out.println(firstUniqChar("z"));

    }

    public static int firstUniqChar(String s) {

//        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
//        for(int i=0;i<=s.length()-1;i++) {
//
//            if(map.containsKey(s.charAt(i))) {
//
//                map.put(s.charAt(i),map.get(s.charAt(i))+1);
//            }else {
//
//                map.put(s.charAt(i),1);
//            }
//
//        }
//
//        for(Integer mapEle:map.values()) {
//
//            if(mapEle.intValue()==1) {
//
//                return s.indexOf(map.get(mapEle));
//            }
//        }
//
//        System.out.println(Arrays.asList(map));
//        return -1;

        int n= s.length();

        for(int i=0;i<n;i++) {

            for(int j=0;j<n;j++) {

                if(i==j) {
                    continue;
                }

                if(i==j && j==n-1)  {
                    return i;
                }
                if(s.charAt(i)==s.charAt(j)) {
                    break;
                }

                if(j==n-1) {

                    return i;
                }
            }
        }

        return -1;
    }
}
