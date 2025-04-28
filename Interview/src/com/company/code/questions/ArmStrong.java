package com.jayaprakash.questions;

import java.util.Scanner;

public class ArmStrong {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(isArmStrong(n));

    }

    public static boolean isArmStrong(int n) {

        int result = 0;
        int originalNumber = n;

        while(n > 0) {

            int rem = n % 10;

            result += (int) Math.pow(rem,3);

            n = (int) n/10;

        }

        return result == originalNumber;

    }
}
