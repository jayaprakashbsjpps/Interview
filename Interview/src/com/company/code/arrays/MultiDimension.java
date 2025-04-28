package com.jayaprakash.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

    public static void main(String[] args) {

        /*
        * 1 2 3
        * 4 5 6
        * 7 8 9
        * */
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = scanner.nextInt();
            }


        }

        for (int[] ints : arr) {

            System.out.print(Arrays.toString(ints));
        }

    }
}
