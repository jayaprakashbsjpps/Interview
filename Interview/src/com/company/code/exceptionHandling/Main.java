package com.jayaprakash.exceptionHandling;

public class Main {
    public static void main(String[] args) {

        try {


            divide(5,0);
            throw new MyException("I am Jp");


        }catch(MyException e) {
            System.out.println(e.getMessage());
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Execute at last");
        }

    }

    static void divide(int a, int b) throws ArithmeticException{
        if(b==0) {
            throw new ArithmeticException("Please don't divide by zero");
        }
    }
}
