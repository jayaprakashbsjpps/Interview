package com.jayaprakash.instabyte100;

public class RotateImage_48 {


    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {

        int n = matrix.length;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;
            }
            
        }

        for (int i = 0; i < n; i++) {

            reverseRow(matrix[i]);
        }


    }

    private static void reverseRow(int[] row) {

        int left = 0, right = row.length-1;

        while(left<right) {

            int temp = row[left];
            row[left]=row[right];
            row[right]=temp;
            left++;
            right--;
        }
    }
}
