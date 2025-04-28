package com.jayaprakash.varags;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {

        fun("Jp1","Jp2",2,3,4,5,6,7,8);
    }

    static void fun(String i,String j,int ...v) {
        System.out.println(Arrays.toString(v));

    }
}
