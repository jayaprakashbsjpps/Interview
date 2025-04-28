package com.jayaprakash.instabyte100_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxStocks_121 {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
       // int[] prices = {1,2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

       /*int minPrice = Integer.MAX_VALUE;
       int maxProfit=0;
       for(int price:prices) {

           if(price<minPrice) {
               minPrice=price;
           } else {
               maxProfit =Math.max(maxProfit,price-minPrice);
           }
       }

       return maxProfit;*/

        AtomicInteger minPrice = new AtomicInteger(Integer.MAX_VALUE);

        int maxProfit = IntStream.of(prices)
                .map(price-> {
                    int min = minPrice.updateAndGet(currMin->Math.min(currMin,price));
                    return price-min;
                }).max().orElse(0);
       return maxProfit;

    }
}
