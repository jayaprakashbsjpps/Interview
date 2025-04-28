package com.jayaprakash.linearSearch;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SearchInString {

    public static void main(String[] args) {

        String name = "Jayaprakash";
        char search = 'z';

        if(search(name,search)) {

            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static boolean search(String name, char search) {

        for (int i = 0; i < name.length(); i++) {

            if(search == name.charAt(i)) {

                return true;
            }
        }

        return false;

    }

    static boolean searchStream(String name, char search) {

        //return IntStream.range(0,name.length()).filter(i->name.charAt(i)==search).findFirst().isPresent();

        for(char s: name.toCharArray()) {

            if(s==search) {
                return true;
            }
            return false;
        }
        return false;
    }
}
