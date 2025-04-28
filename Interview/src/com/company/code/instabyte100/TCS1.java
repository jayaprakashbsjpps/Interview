package com.jayaprakash.instabyte100;

import java.util.Arrays;

public class TCS1 {

//    String s = pr@tu!
//
//    Reverse string without affecting special characters
//
//    Output ut@rp!


    public static void main(String[] args) {

        String s="pr@tu!";

        char[] s1=s.toCharArray();

        int left =0;
        int right = s.length()-1;
        int i=0;

        while(left<right) {

            if(s1[left]=='@' || s1[left]=='!') {

                left++;
                continue;
            }
            if(s1[right]=='@' || s1[right]=='!') {
                right--;
                continue;
            }

            swap(s1,left,right);
            left++;
            right--;
        }

        System.out.println(Arrays.toString(s1));
    }

    public static void swap(char[] s1,int left, int right) {

        char temp= s1[left];
        s1[left]=s1[right];
        s1[right]= temp;
    }
}
