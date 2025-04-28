package com.jayaprakash.loops;

import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        char ch = input.trim().charAt(0);

        if(ch >='a' && ch <= 'z') {

            System.out.println("Smaller case");
        } else {

            System.out.println("Upper case");
        }



    }
}
