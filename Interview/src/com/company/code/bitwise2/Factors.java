package com.jayaprakash.bitwise2;

import java.util.ArrayList;

public class Factors {

    public static void main(String[] args) {

        factors1(20);
        System.out.println();
        factorial2(20);
        System.out.println();
        factorial3(20);
    }
    //O(n)
    static void factors1(int n) {
        for (int i = 1; i <=n; i++) {

            if(n % i ==0) {
                System.out.printf(i+" ");
            }
            
        }
    }

    //O(sqrt(n)
    static void factorial2(int n) {

        for (int i = 1; i <=Math.sqrt(n); i++) {

            if((n%i)==0) {

                if(n/i==i) {
                    System.out.println(i);
                } else {
                    System.out.printf(i+" "+n/i+" ");
                }

            }
        }
    }

    //both time and space with be O(sqrt(n)
    static void factorial3(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <=Math.sqrt(n); i++) {

            if((n%i)==0) {

                if(n/i==i) {
                    System.out.println(i);
                } else {
                    System.out.printf(i+" ");
                    list.add(n/i);
                }

            }
        }

        for (int i = list.size()-1; i >=0 ; i--) {

            System.out.print(list.get(i)+" ");
        }
    }
}
