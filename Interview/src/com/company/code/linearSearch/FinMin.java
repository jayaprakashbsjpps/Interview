package com.jayaprakash.linearSearch;

import java.util.stream.IntStream;

public class FinMin {

    public static void main(String[] args) {

        int[] arr = {18,12,-7,3,14,28};
        System.out.println(min(arr));
    }

    static long min(int[] arr) {

//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//
//            if(arr[i] < min)  {
//                min = arr[i];
//            }
//        }

        return IntStream.range(0, arr.length).map(i->arr[i]).min().getAsInt();
    }
}
