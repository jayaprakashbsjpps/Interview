package com.jayaprakash.bitwise2;

import java.util.*;

public class Solution {
    public int solution(int[] A, String[] D) {
        Map<String, List<Integer>> monthlyTransactions = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            String month = D[i].substring(0, 7); // Extract YYYY-MM part
            monthlyTransactions.putIfAbsent(month, new ArrayList<>());
            monthlyTransactions.get(month).add(A[i]);
        }

        int finalBalance = 0;
        for (String month : monthlyTransactions.keySet()) {
            List<Integer> transactions = monthlyTransactions.get(month);
            int monthlyBalance = 0;
            int cardPayments = 0;
            int cardPaymentCount = 0;

            for (int amount : transactions) {
                monthlyBalance += amount;
                if (amount < 0) {
                    cardPayments += amount;
                    cardPaymentCount++;
                }
            }

            if (cardPaymentCount < 3 || cardPayments > -100) {
                monthlyBalance -= 5; // Apply card fee
            }

            finalBalance += monthlyBalance;
        }

        return finalBalance;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] A = {100, 100, 100, -10};
        String[] D = {"2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29"};
        System.out.println("Final balance: " + sol.solution(A, D)); // Output should be 230
    }
}
