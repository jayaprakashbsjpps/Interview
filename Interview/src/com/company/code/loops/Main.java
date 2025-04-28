package com.jayaprakash.loops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n * 4; i+=4) {

            System.out.println("i "+i);
        }
    }
}
