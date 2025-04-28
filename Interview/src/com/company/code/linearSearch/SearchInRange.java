package com.jayaprakash.linearSearch;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SearchInRange {

    public static void main(String[] args) {

        String name = "Jayaprakash";
        char search = 'z';

        int start = 3;
        int end = 5;

        if(search(name,search,start,end)) {

            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static boolean search(String name, char search,int start, int end) {

//        for (int i = start; i < end; i++) {
//
//            if(search == name.charAt(i)) {
//
//                return true;
//            }
//        }

        return IntStream.range(start,end).filter(i->name.charAt(i)==search).findFirst().isPresent();

    }
}
