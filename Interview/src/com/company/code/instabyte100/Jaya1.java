package com.jayaprakash.instabyte100;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Jaya1 {

    public static void main(String[] args) {

        String s1="javadeveloper";

   Map<Character,Long> frequencyMap=s1.chars()
           .mapToObj(c->(char)c)
           .collect(Collectors.groupingBy(Function.identity(),
               LinkedHashMap::new,
               Collectors.counting()));

        System.out.println(frequencyMap.entrySet().stream().filter(entry->entry.getValue()==1)
              .map(Map.Entry::getKey).findFirst().get());



    }
}
