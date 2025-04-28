package com.jayaprakash.instabyte100;

import java.util.*;
import java.util.stream.Collectors;

public class Cognizant3 {

    public static void main(String[] args) {

        HashMap<String,Integer> employeeMap = new HashMap<>();
        employeeMap.put("Alice",70000);
        employeeMap.put("Bob", 85000);
        employeeMap.put("Charlie", 60000);
        employeeMap.put("Diana", 90000);

       // sortByValueStream(employeeMap);

        //sortByValueWithoutStream(employeeMap);

    }

    private static void sortByValueStream(HashMap<String, Integer> employeeMap) {

   Map<String,Integer> sortedMap=   employeeMap.entrySet()
               .stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
               .collect(
                       Collectors.toMap(
                               Map.Entry::getKey,
                               Map.Entry::getValue,
                               (e1,e2)->e1,
                               LinkedHashMap::new

                       )
               );

        sortedMap.forEach((k,v)-> System.out.println(k+" : "+v));
    }

    private static void sortByValueWithoutStream(HashMap<String, Integer> employeeMap) {

        List<Map.Entry<String,Integer>> list = new ArrayList<>(employeeMap.entrySet());
        list.sort((e1,e2)->e2.getValue().compareTo(e1.getValue()));



        LinkedHashMap<String,Integer> sortedMap = new LinkedHashMap();

        for (Map.Entry<String,Integer> entry:list) {

            sortedMap.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String,Integer> entry:sortedMap.entrySet()) {

            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        for(Map.Entry<String,Integer> entry:list) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
