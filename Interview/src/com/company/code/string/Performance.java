package com.jayaprakash.string;

public class Performance {

    public static void main(String[] args) {

        String series="";

        for (int i = 0; i < 26; i++) {

            char c= (char)('a'+i);

            series= series + c;

        }

        System.out.println(series);

        System.out.println("a"+'b');
    }
}
