package com.jayaprakash.maths;

public class Sqrt {

    public static void main(String[] args) {

//        System.out.println(mySqrt(2147395599
//        ));
//        System.out.println(Math.sqrt(2147395599
//        ));
        int x=3;
        System.out.println(mySqrt(x));
        System.out.println(Math.sqrt(x));

    }

    public static double mySqrt(int x) {

        if(x==1 || x==0) {
            return x;
        }
        int start=1;
        int end=x;
        int mid=0;
        while(start<=end) {

            mid=start+(end-start)/2;
            if((long)mid * mid >(long)x) {
                end = mid-1;
            }
            else if(mid*mid==x) {
                return mid;
            } else {
                start=mid+1;
            }
        }

        double sqrt= Math.round(end);
        double incr=0.1;
        sqrt+=incr;

        for (int i = 0; i < 2; i++) {

            while(sqrt * sqrt<x) {
                sqrt+=incr;
            }
            sqrt-=incr;
            incr/=10;
        }

        return sqrt;
    }



}
