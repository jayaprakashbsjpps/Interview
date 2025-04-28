package com.jayaprakash.stringBuffer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        StringBuffer sb1=new StringBuffer("Jayaprakash 4");

        sb.append("Jayaprakash");
        sb.append(" is nice");
        sb.insert(2," from second ");

       // sb.reverse();
        sb.replace(2,15,"");
        sb.delete(2,4);
        StringBuffer sb3=new StringBuffer(30);
        System.out.println(sb);
        System.out.println(sb1);

        String sentence = "Hi h hjh hjkso siowl";
        System.out.println(sentence.replaceAll("\\s",""));

        String arr="Jayaprakash,Sanjay,Jitesh";
        String[] names = arr.split(",");

        System.out.println(Arrays.toString(names));

        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));

    }
}
