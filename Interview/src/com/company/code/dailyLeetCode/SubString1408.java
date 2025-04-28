package com.jayaprakash.dailyLeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubString1408 {

    public static void main(String[] args) {

        String[] words={"mass","as","hero","superhero"};
        System.out.println(stringMatching(words));
    }

    public  static List<String> stringMatching(String[] words) {

        Set<String> resultSet= new HashSet<>();
        for(int i=0;i<words.length;i++) {

            for(int j=0;j< words.length;j++) {

                if(i==j) {
                    continue;
                }
               if(words[i].contains(words[j])) {
                   resultSet.add(words[j]);
               }
               if(words[j].contains(words[i])) {
                   resultSet.add(words[i]);
               }
            }
        }

        return new ArrayList<>(resultSet);
    }
}
