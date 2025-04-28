package com.jayaprakash.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(12);

        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);

        list.add(0,99);
        System.out.println(list);

        list.remove(2);

        System.out.println(list);

        //HashSet<Integer> hashSet = new HashSet<>();

        //hashSet.add();

    }
}
