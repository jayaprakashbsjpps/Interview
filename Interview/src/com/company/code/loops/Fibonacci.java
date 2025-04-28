package com.jayaprakash.loops;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

//        int a =0;
//        int b = 1;
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

//        int[] arr = new int[n];
//        arr[1]=1;
//        int i=2;
//        while(i<=n) {
//            arr[i] = arr[i-1] + arr[i-2];
//            i++;
//        }
//      [0,1,1,2,3,5]
         int a = 0;
         int b = 1;
         int count = 2;

         while(count<=n) {

             int temp = b;
             b = a+b;
             a = temp;
             count++;

         }

        System.out.println(b);

    }
}
