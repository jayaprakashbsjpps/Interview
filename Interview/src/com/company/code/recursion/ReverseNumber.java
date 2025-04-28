package com.jayaprakash.recursion;

public class ReverseNumber {
   static int reverse_num=0;
    public static void main(String[] args) {

//        int n = 132;
//        reverse(n);
//        if(n<0) {
//
//            reverse_num = reverse_num * -1;
//        }
//
//        System.out.println(reverse_num);

        System.out.println(reverse2(152));

    }

    static void reverse(int n) {

        if(n<0) {
            n= n*-1;
        }
        if(n<=0) {
            return ;
        }
        reverse_num= reverse_num * 10 + n % 10;
        reverse(n/10);

    }

    static int reverse2(int n) {

        int digits = (int) (Math.log10(n))+1;

        return helper(n,digits);

    }

    private static int helper(int n, int digits) {

        if(n%10==n) {
            return n;
        }

        int rem = n % 10;
        return rem* (int)Math.pow(10,digits-1) + helper(n/10,digits-1);

    }
}
