package com.jayaprakash.bitwise;

public class FindUnique {

    public static void main(String[] args) {

        int[] arr = {2,3,4,1,2,1,3,6,4};
        int ans=0;

        for (int i = 0; i <=arr.length-1 ; i++) {

            ans = ans ^ arr[i];
        }

        System.out.println(ans);
    }
}
