package com.jayaprakash;

import java.util.Stack;

public class Cognizant {

    public static void main(String[] args) {

        String str = "madam";

        System.out.println(isPalindrome(str));

        Stack<Character> stack = new Stack<>();


    }

    static boolean isPalindrome(String str) {

        int left=0;
        int right= str.length()-1;

        while(left<right) {

            char c1= str.charAt(left);
            char c2= str.charAt(right);

            if(c1!=c2) {
                return false;
            }

            left++;
            right--;

        }

        return true;
    }
}
