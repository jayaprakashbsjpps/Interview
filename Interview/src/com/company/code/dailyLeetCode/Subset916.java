package com.jayaprakash.dailyLeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subset916 {

    public static void main(String[] args) {

    }

    public List<String> wordSubsets(String[] words1, String[] words2) {

        Set<String> result = new HashSet<>();

        for(int i=0;i<words2.length;i++) {
             String str1= words2[i];
            for(int j=0;j<words1.length;j++) {

               if(words1[j].contains(str1)) {
                   result.add(words1[j]);
               }
            }
        }

        return new ArrayList<>(result);
    }
}
