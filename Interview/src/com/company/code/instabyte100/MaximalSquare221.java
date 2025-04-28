package com.jayaprakash.instabyte100;

public class MaximalSquare221 {
    public static void main(String[] args) {

        char[][] matrix={{'1','0','1','0','0'},
                         {'1','0','1','1','1'},
                         {'1','1','1','1','1'},
                         {'1','0','0','1','0'}};

        System.out.println(maximalSquare(matrix));
    }

    public static int maximalSquare(char[][] matrix) {

       if(matrix==null || matrix.length==0) return 0;

       int m = matrix.length,n=matrix[0].length;

       int[] dp = new int[n+1];

       int maxSide=0,prev=0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1,temp; j <=n; j++) {
                temp = dp[j];
                if(matrix[i-1][j-1]=='1') {
                    dp[j]= Math.min(dp[j],Math.min(dp[j-1],prev))+1;
                    maxSide = Math.max(maxSide,dp[j]);
                } else {
                    dp[j]=0;
                }
                prev=temp;
            }

        }
        return  maxSide * maxSide;
    }
}
