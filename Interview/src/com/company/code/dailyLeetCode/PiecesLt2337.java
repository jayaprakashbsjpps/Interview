package com.jayaprakash.dailyLeetCode;

public class PiecesLt2337 {
    public static void main(String[] args) {

        String start="_L__R__R_";
        String target="L______RR";

        System.out.println(canChange(start,target));
    }

    public static boolean canChange(String start, String target) {

      if(!start.replace("_","").equals(target.replace("_",""))) {
          return false;
      }

      int n=start.length();
      int i=0,j=0;

      while(i<n && j<n) {

            while(i<n && start.charAt(i)=='_') i++;
            while(j<n && target.charAt(j)=='_') j++;
            if(i==n || j==n) break;

            char charS= start.charAt(i);
            char charT = target.charAt(j);

            if(charS != charT) return false;

            if(charS=='L' && i<j) return false;
            if(charT=='R' && i>j) return false;

            i++;
            j++;
      }


      return true;
    }
}
