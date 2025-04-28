package com.jayaprakash.instabyte100;

public class Stocks2_122 {

    public static void main(String[] args) {

       // int[] prices={7,1,5,3,6,4};
        int[] prices={1,2,3,4,5};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int i=0;
        int low=prices[0];
        int high = prices[0];
        int n = prices.length;
        int profit=0;

        while(i<n-1) {

            //buy
            while((i<n-1) && prices[i]>=prices[i+1]) {
                i+=1;
            }
            low=prices[i];

            //sell
            while((i<n-1) && prices[i]<=prices[i+1]) {
                i+=1;
            }

            high = prices[i];
            profit+=(high-low);
        }

        return profit;
    }
}
