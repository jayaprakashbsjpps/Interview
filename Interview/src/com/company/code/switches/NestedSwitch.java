package com.jayaprakash.switches;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        String department= scanner.next();

        switch (id) {

            case 1:
                System.out.println("Employee 1");
               break;
            case 2:
                System.out.println("Employee 2");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                }

        }
    }
}
