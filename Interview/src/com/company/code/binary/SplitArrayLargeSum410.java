package com.jayaprakash.binary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SplitArrayLargeSum410 {

    public static void main(String[] args) {
        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l","He","lo");
        System.out.println(cText);
        String dText = "He".concat("llo");
        String eText = "hello";
        List<String> hellos =
                Arrays.asList(aText, bText, cText, dText, eText);
        hellos.forEach(s -> System.out.println(s + ": " + s.hashCode()));
        Set<String> mySet = new HashSet<>(hellos);
        System.out.println("mySet = " + mySet);
        System.out.println("# of elements = " + mySet.size());
    }
}
