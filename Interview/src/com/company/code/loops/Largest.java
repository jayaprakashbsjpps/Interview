package com.jayaprakash.loops;

import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int larg =  Math.max(Math.max(a,b),c);

        System.out.println("Largest Number is "+larg);
    }
}
