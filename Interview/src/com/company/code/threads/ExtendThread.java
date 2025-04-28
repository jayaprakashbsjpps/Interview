package com.jayaprakash.threads;

public class ExtendThread {

    public static void main(String[] args) {

        NewThread1 nt= new NewThread1();

        nt.start();

        try{
            for (int i = 5; i > 0; i--) {

                System.out.println("Main thread: "+i);
                Thread.sleep(1000);
            }

        }catch (InterruptedException e) {

        }
    }
}
