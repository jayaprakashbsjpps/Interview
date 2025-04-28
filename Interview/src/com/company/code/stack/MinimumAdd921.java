package com.jayaprakash.stack;

import java.util.Stack;

public class MinimumAdd921 {

    public static void main(String[] args) {

        String s="()))((";
       // String s="(((";

        System.out.println(minAddToMakeValid(s));

    }

    public static int minAddToMakeValid(String s) {

        if(s.isEmpty()) {
            return 0;
        }

        Stack<Character> stack= new Stack<Character>();

        for(Character ch:s.toCharArray()) {

            if(ch==')') {

                if(!stack.isEmpty() && stack.peek()=='(') {
                    stack.pop();
                } else {

                    stack.push(ch);
                }

            } else {

                stack.push(ch);

            }

        }

        return stack.size();

    }
}
