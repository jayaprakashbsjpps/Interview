package com.jayaprakash.bitwise;

import java.util.Arrays;

public class flippingImage832 {

    //https://leetcode.com/problems/flipping-an-image/description/

    public static void main(String[] args) {

        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

        System.out.println( flipAndInvertImage(image));

    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {


            for (int j = 0; j < image[i].length/2; j++) {

                swap(image[i],j,(image[i].length-1) -j);

            }

            for (int j = 0; j < image[i].length; j++) {

                image[i][j] ^=1;
            }

        }

        return image;
    }

    public static void swap(int[] image1, int a, int b) {

        int temp = image1[a];
        image1[a]= image1[b];
        image1[b]= temp;
    }
}
