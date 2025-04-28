package com.jayaprakash.problem100;

public class ValidateParentheses {

    public static void main(String[] args) {

        //String s= "(([]){})";
        String s="[({(())}[()])]";

        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {

        int start=0;
        int end = s.length()-1;

        int countOpen=0;
        int countClose=0;
        while(start<=end) {


            if((s.charAt(start)=='(' && s.charAt(end)==')') || (s.charAt(start)=='[' && s.charAt(end)==']') || (s.charAt(start)=='{' && s.charAt(end)=='}')) {
                start++;
                end--;
            } else if((start+1) <=end && ((s.charAt(start)=='(' && s.charAt(start+1)==')') || (s.charAt(start)=='[' && s.charAt(start+1)==']') ||  (s.charAt(start)=='{' && s.charAt(start+1)=='}') )) {

                start= start+2;
            }

            else if(end-1 >=0 && (s.charAt(end)==')' && s.charAt(end-1)=='(') || (s.charAt(end)==']' && s.charAt(end-1)=='[') ||  (s.charAt(end)=='}' && s.charAt(end-1)=='{'))
            {

                end= end-2;
            }

            else {
                return false;
            }


        }

        return true;
    }
}
