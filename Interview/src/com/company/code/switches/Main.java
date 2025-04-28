package com.jayaprakash.switches;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        //String input = scanner.next().trim();

//        switch(input) {
//
//            case "Apple":
//                System.out.println("Apple");
//                break;
//
//            case "Mango":
//                System.out.println("Mango");
//                break;
//
//            default:
//                System.out.println("Other fruit");
//
//        }

        int day = scanner.nextInt();

        switch (day) {
            case 1, 2, 3 -> System.out.println("Wednesday");
            default -> System.out.println("Good day");
        }

    }
}
