package com.jayaprakash.stack;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String s="()";

        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++) {

            if(s.charAt(i)=='('|| s.charAt(i)=='{'|| s.charAt(i)=='[') {
                stack.push(s.charAt(i));
            }

            if(s.charAt(i)==')'|| s.charAt(i)=='}'|| s.charAt(i)==']') {
                if(stack.peek()=='(' && s.charAt(i)==')') {
                    stack.pop();
                }else if(stack.peek()=='{' && s.charAt(i)=='}') {
                    stack.pop();
                } else if(stack.peek()=='[' && s.charAt(i)==']') {
                    stack.pop();
                }
                else {

                    return false;
                }
            }

        }

        return true;

    }
}
