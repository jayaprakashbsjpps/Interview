package com.jayaprakash.stringBuffer;

import java.util.Random;

public class RandomString {

    public static void main(String[] args) {

        System.out.println(generateRandom(4));
    }

    public static StringBuffer generateRandom(int size) {

        Random rand = new Random();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < size; i++) {
            int rand1=rand.nextInt(26);
            System.out.println(rand1);

            char c = (char)('a'+ rand1);
            sb.append(c);
        }

        return sb;
    }
}
