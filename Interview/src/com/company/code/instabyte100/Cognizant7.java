package com.jayaprakash.instabyte100;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Cognizant7 {

    public static void main(String[] args) {

        //Rest api to support all crud operations
        //listof users
        //It should also have authentication and authorization enabled
        //We should also connect to Database and DB
        //Implement resilency for all end points
        //Configure rate limiting
        //how do you avoid concurrency issues
        //how do you maintain versioning of api
        //how do you create increment users
        //another one telecaller user data
        //2 client one client wants branch user data and another telecaller customer care data
        //Cucumber and Karate api testing unit testing 100% coverage


        List<String> list = Arrays.asList("Anand","Raja");
        System.out.println(list.stream()
                .collect(Collectors.toMap(str->str,str->str.length())));

        /*Map<String, Integer> charCountPerWord = list.stream()
                .collect(Collectors.toMap(
                        str -> str,
                        str -> str.length()
                ));*/

        //System.out.println(charCountPerWord);

    }
}
