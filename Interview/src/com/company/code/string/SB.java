package com.jayaprakash.string;

public class SB {

    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder();

        for (int i = 0; i < 26; i++) {

            char c= (char)('a'+i);

            sb= sb.append(c);

        }

        System.out.println(sb.reverse());

        System.out.println(sb.deleteCharAt(0));

    }
}
