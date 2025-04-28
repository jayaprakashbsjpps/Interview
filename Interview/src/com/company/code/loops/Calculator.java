package com.jayaprakash.loops;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int result=0;
        boolean input = true;
        char op;
        while(true) {
            System.out.println("Enter the operator");
           op = scanner.next().trim().charAt(0);

            if(op=='x'|| op=='X') {
                break;
            }
            else if(op== '+' || op== '-' || op== '*' || op== '/' || op== '%') {
                     System.out.println("Enter 2 number");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();

                    if(op== '+') {
                        result= num1 + num2;

                    } else  if(op== '-') {
                        result= num1 - num2;
                    }else  if(op== '*') {
                        result= num1 * num2;
                    }else  if(op== '/') {
                        if(num2!=0) {
                            result= num1 / num2;
                        }

                    }else if(op== '%') {
                        result= num1 % num2;
                    }
                 System.out.println("Addition of 2 numbers "+result);

            }
            else {
                System.out.println("Invalid operation");
            }
        }


    }
}
