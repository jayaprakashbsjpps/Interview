package com.jayaprakash.binary;

import java.util.Arrays;

public class SmallestNumber744 {

    public static void main(String[] args) {

        char[] letters = { 'e','e','e','e','e','e','n','n','n','n' };

        System.out.println(nextGreatestLetter(letters,'a'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length -1;
        while(start<=end) {

            int mid = (start + (end - start)/2);

            if((mid+1) < letters.length && letters[mid] == letters[mid+1]) {


                start = mid + 1;

            }

            else  if(target >= letters[mid]) {

                start = mid + 1;
            }
            else {

                end = mid -1;
            }
        }



        return letters[start % letters.length];
    }
}
