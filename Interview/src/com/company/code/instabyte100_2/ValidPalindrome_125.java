package com.jayaprakash.instabyte100_2;

public class ValidPalindrome_125 {

    public static void main(String[] args) {

        String s="0P";
        System.out.println(isValidPalindrome(s));
    }
    public static boolean isValidPalindrome(String s) {

      s= s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
      int start=0,end=s.length()-1;
      while(start<end) {

          if(s.charAt(start)!=s.charAt(end)) {
              return false;
          }
          start++;
          end--;
      }
        return true;
    }
}
