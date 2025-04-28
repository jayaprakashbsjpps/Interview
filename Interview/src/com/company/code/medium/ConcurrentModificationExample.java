package com.jayaprakash.medium;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.stream.Collectors;

public class ConcurrentModificationExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A","B","C","D");

        try {

            List<String> result =list.stream()
                    .peek(item-> {
                        if(item.equals("B")) {
                            list.add("E");
                        }
                    }).collect(Collectors.toList());
        }catch (ConcurrentModificationException e) {

            System.out.println("Caught ConcurrentModificationException");
        }

        System.out.println("Final list "+list);
    }
}
