package com.jayaprakash.dailyLeetCode;

import java.util.Scanner;

public class CountBinarySubString696 {

    public static void main(String[] args) {

        //String s="00001110011";
        String s="00110011";
        System.out.println(countBinarySubStrings(s));

//        Scanner scan = new Scanner(System.in);
//        int n =Integer.valueOf(scan.nextLine());
//        for (int i = 0; i < n; i++) {
//            String input1 = scan.nextLine();
//            countBinarySubStrings(input1);
//        }
    }

    public static int countBinarySubStrings(String s) {
        int curr = 1, prev=0,ans=0;

        for (int i = 1; i < s.length(); i++) {

            if(s.charAt(i)==s.charAt(i-1)) curr++;
            else {
                ans+=Math.min(curr,prev);
                prev=curr;
                curr=1;
            }
        }
        return ans + Math.min(curr,prev);
    }
}
