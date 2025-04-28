package com.jayaprakash.bitwise;

import java.util.HashMap;
import java.util.Map;

public class FindSingleArray {

    public static void main(String[] args) {

         int[] arr = {2,3,4,1,2,1,3,6,4};

         Map<Integer,Integer> map = new HashMap<>();

         for(int i=0;i<=arr.length-1;i++) {

              if(map.containsKey(arr[i])) {

                  map.put(arr[i],map.get(arr[i]) +1);
              } else {

                  map.put(arr[i],1);
              }

         }

         for (Map.Entry<Integer,Integer> entry:map.entrySet()) {

             if(entry.getValue()==1) {

                 System.out.println(entry.getKey());
                 break;
             }
         }
    }
}
