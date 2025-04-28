package com.jayaprakash.instabyte100;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindow76 {

    public static void main(String[] args) {

        String s="ADOBECODEBANC";
        String t="ABC";
        System.out.println(minWindow(s,t));
    }

    public static String minWindow(String s, String t) {

       Map<Character,Integer> map = new HashMap<>();

       for (int i=0;i<t.length();i++) {

           Character tChar = t.charAt(i);
           int count = map.getOrDefault(tChar,0);
           map.put(tChar,count+1);
       }

       int tCharacterCount = map.size();
       int lIndex = 0;
       int rIndex = 0;
       int lAns = -1;
       int rAns = -1;

       while(rIndex<=s.length()) {

           if(tCharacterCount > 0) {

               if(rIndex==s.length()) break;
               rIndex++;
               Character sChar = s.charAt(rIndex-1);
               if(map.containsKey(sChar)) {

                   int count = map.get(sChar);
                   if(count==1)
                       tCharacterCount--;
                   map.put(sChar,count-1);

               }
           } else {

               int currWindow = rIndex - lIndex;
               int answer = rAns - lAns;
               if(lAns==-1 || currWindow<answer) {
                   lAns = lIndex;
                   rAns = rIndex;

               }
               lIndex++;
               Character sChar = s.charAt(lIndex-1);
               if(map.containsKey(sChar)) {
                   int count = map.get(sChar);
                   if(count==0)
                       tCharacterCount++;
                   map.put(sChar,count+1);

               }
           }
       }

       if(lAns==-1)
           return "";
       else
           return s.substring(lAns,rAns);

    }
}
