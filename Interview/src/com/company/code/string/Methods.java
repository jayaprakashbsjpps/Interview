package com.jayaprakash.string;

import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {

        String name="Kunal Kushwaha";

//        System.out.println(Arrays.toString(name.toCharArray()));
//        System.out.println(name.toLowerCase());
//        System.out.println(name.lastIndexOf('a'));

        String name2="1.1.1.1";
        System.out.println(name2.replace(".","[.]"));
        System.out.println(name.replace('n','j'));
//
//        String gfg2 = String.join("->", "My", "name", "is", "Niraj", "Pandey");
//
//        System.out.println("       kunal   ".strip());
//
//        System.out.println(gfg2);

        System.out.println(Arrays.toString(name.split(" ")));
    }
}
