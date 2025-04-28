package com.jayaprakash.linearSearch;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaximumWealth {

    public int maximumWealth(int[][] accounts) {

        //  return IntStream.range(0,accounts.length).flatMap(i->
        //         Arrays.stream(accounts).mapToInt(j-> Arrays.stream(j).sum())
        //         ).max().getAsInt();

        int[] wealthArr = new int[accounts.length];
        int max = 0;
        for(int i=0;i<accounts.length;i++) {
            int sum=0;
            for(int j=0;j<accounts[i].length;j++) {
                sum += accounts[i][j];
            }

            wealthArr[i]=sum;

            if(wealthArr[i] > max) {
                max = wealthArr[i];
            }
        }

        return max;

    }
}
