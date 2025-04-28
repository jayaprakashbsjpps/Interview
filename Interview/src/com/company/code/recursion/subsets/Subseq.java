package com.jayaprakash.recursion.subsets;

public class Subseq {
    public static void main(String[] args) {

        String unprocess="abc";
        String process="";
        subseq(process,unprocess);
    }

    public static void subseq(String process ,String unprocess) {

        if(unprocess.isEmpty()) {
            System.out.print(process+" ");
            return;
        }

        char ch= unprocess.charAt(0);
        subseq(process+ch,unprocess.substring(1));
        subseq(process,unprocess.substring(1));
    }
}
